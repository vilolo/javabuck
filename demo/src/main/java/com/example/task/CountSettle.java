package com.example.task;

import com.example.mapper.AreaAgentMapper;
import com.example.mapper.MemberMapper;
import com.example.mapper.ProfitLogMapper;
import com.example.mapper.ShopOrderMapper;
import com.example.model.AreaAgent;
import com.example.model.AreaAgentExample;
import com.example.model.ProfitLog;
import com.example.model.ShopOrder;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class CountSettle {

    @Autowired
    AreaAgentMapper areaAgentMapper;

    @Autowired
    MemberMapper memberMapper;

    @Autowired
    ProfitLogMapper profitLogMapper;

    @Autowired
    ShopOrderMapper shopOrderMapper;

    private Map<Integer, List<ShopOrder>> agentOrderList = new HashMap<>();

    public void index(){

        //查出所有正常的渠道商
        AreaAgentExample areaAgentExample = new AreaAgentExample();
        AreaAgentExample.Criteria criteria = areaAgentExample.createCriteria();
        criteria.andStatusEqualTo((byte)1);
        List<AreaAgent> list = areaAgentMapper.selectByExample(areaAgentExample);

        //查询分月：1月，2月
        String[] m = new String[]{"2019-01", "2019-02"};

        for (String mon : m){
            agentOrderList = new HashMap<>();
            for (AreaAgent item:
                    list) {

                //获取自己订单
//                List<ShopOrder> shopOrders = shopOrderMapper.getShopOrderByMonth(item.getMemberId(), mon);
//                if (shopOrders.size()>0){
//                    agentOrderList.put(item.getMemberId(), shopOrders);
//                }

                //???????????????????????
                rGetShopOrders(item.getMemberId(), item.getMemberId(), mon);
            }

            System.out.println(mon+"===========================");

            //导出数据
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("sheet1");
            HSSFRow rowRowName = sheet.createRow(0);

            HSSFCell rr = rowRowName.createCell(0);
            rr.setCellValue("台头");

            int j = 1;
            for (Integer key : agentOrderList.keySet()){
                System.out.println("agent_id=="+key);
                Map<String, Object> member = memberMapper.getMemberInfo(key);
                HSSFRow link = sheet.createRow(j);
                int lie = 0;
                link.createCell(lie).setCellValue(j);
                lie++;link.createCell(lie).setCellValue(member.get("create_time")!=null?timeStamp2Date(member.get("create_time").toString()):"");
                lie++;link.createCell(lie).setCellValue(member.get("id").toString());
                lie++;link.createCell(lie).setCellValue(member.get("name")!=null?member.get("name").toString():"");
                lie++;link.createCell(lie).setCellValue(member.get("mobile")!=null?member.get("mobile").toString():"");
                lie++;link.createCell(lie).setCellValue(member.get("agent_area").toString());
                lie++;link.createCell(lie).setCellValue(member.get("area_name").toString());
                lie++;link.createCell(lie).setCellValue(member.get("r_name")!=null?member.get("r_name").toString():"");
                lie++;link.createCell(lie).setCellValue(member.get("r_mobile")!=null?member.get("r_mobile").toString():"");
                //购买1排插（399）
                int paicha1=0;
                //购买6排插（2394）
                int paicha6=0;
                //购买1小墨2排插（2786）
                int xiaomo1paicha2=0;
                //购买1小墨（1988）
                int xiaomo=0;
                //本月直推省
                int zt_privince=0;
                //本月直推市
                int zt_city=0;
                //本月直推区县
                int zt_area=0;
                //本月直推店长
                int zt_shoper=0;
                //本月直推会员
                int zt_member=0;
                //本月直推店长已完成销售业绩
                BigDecimal zt_shoper_sale=BigDecimal.valueOf(0);
                //本月直推会员已完成销售业绩
                BigDecimal zt_member_sale=BigDecimal.valueOf(0);
                //本月总销售业绩
                BigDecimal zt_sale_total=BigDecimal.valueOf(0);

                //店长订单，会员订单，自己或其他订单
                StringBuilder salerOrder = new StringBuilder();
                StringBuilder memberOrder = new StringBuilder();
                StringBuilder otherOrder = new StringBuilder();

                List<ShopOrder> llist = agentOrderList.get(key);
                for (ShopOrder sss : llist){
                    //System.out.println("========="+sss.getId());
                    zt_sale_total = zt_sale_total.add(sss.getPayMoney());

                    switch (sss.getRemark()){
                        case "1":
                            zt_member_sale = zt_member_sale.add(sss.getPayMoney());
                            if ("".equals(memberOrder.toString())) {
                                memberOrder.append(sss.getSn());
                            } else {
                                memberOrder.append(",").append(sss.getSn());
                            }
                            break;
                        case "2":
                            zt_shoper_sale = zt_shoper_sale.add(sss.getPayMoney());
                            if ("".equals(salerOrder.toString())) {
                                salerOrder.append(sss.getSn());
                            } else {
                                salerOrder.append(",").append(sss.getSn());
                            }
                            break;
                        default:
                            if ("".equals(otherOrder.toString())) {
                                otherOrder.append(sss.getSn());
                            } else {
                                otherOrder.append(",").append(sss.getSn());
                            }
                            break;
                    }

                    if (sss.getItems().contains("103984")){
                        paicha1 += sss.getGoodsNum();
                    }else
                    if (sss.getItems().contains("103987")){
                        paicha6 += sss.getGoodsNum();
                    }else
                    if (sss.getItems().contains("103988")){
                        xiaomo1paicha2 += sss.getGoodsNum();
                    }else
                    if (sss.getItems().contains("103989")){
                        xiaomo += sss.getGoodsNum();
                    }
                }

                zt_privince = memberMapper.countDirectAgent(key, 6, mon);
                zt_city = memberMapper.countDirectAgent(key, 5, mon);
                zt_area = memberMapper.countDirectAgent(key, 4, mon);

                //成为店长和会员的时间没有记录，目前以创建时间为准
                zt_shoper = memberMapper.countDirectMember(key, 3, mon);
                zt_member = memberMapper.countDirectMember(key, 2, mon);

                lie++;link.createCell(lie).setCellValue(paicha1*399);
                lie++;link.createCell(lie).setCellValue(paicha6*2394);
                lie++;link.createCell(lie).setCellValue(xiaomo1paicha2*2786);
                lie++;link.createCell(lie).setCellValue(xiaomo*1988);
                lie++;link.createCell(lie).setCellValue(zt_privince);
                lie++;link.createCell(lie).setCellValue(zt_city);
                lie++;link.createCell(lie).setCellValue(zt_area);
                lie++;link.createCell(lie).setCellValue(zt_shoper);
                lie++;link.createCell(lie).setCellValue(zt_member);
                lie++;link.createCell(lie).setCellValue(zt_shoper_sale.toString());
                lie++;link.createCell(lie).setCellValue(zt_member_sale.toString());
                lie++;link.createCell(lie).setCellValue(zt_sale_total.toString());
                lie++;link.createCell(lie).setCellValue(otherOrder.toString());
                lie++;link.createCell(lie).setCellValue(memberOrder.toString());
                lie++;link.createCell(lie).setCellValue(salerOrder.toString());

                j++;
            }

            FileOutputStream out = null;
            try {
                //out = new FileOutputStream("F:/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString() +".xls");
                out = new FileOutputStream("F:/渠道商业绩统计"+mon+".xls");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                workbook.write(out);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static String timeStamp2Date(String seconds) {
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){
            return "";
        }
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds+"000")));
    }

    //递归获取直推的订单
    private void rGetShopOrders(Integer agentMemberId, Integer memberId, String mon){

        //获取渠道商直推订单
        List<ShopOrder> list = shopOrderMapper.getDirectOrder(memberId, mon);
        if (list.size() > 0){
            for (ShopOrder ss:
                 list) {
                if (!memberId.equals(ss.getMemberId())){
                    rGetShopOrders(agentMemberId, ss.getMemberId(), mon);
                }
            }
        }

        //添加到agentOrderList
        if (agentOrderList.get(agentMemberId)!=null){
            List<ShopOrder> listOld = agentOrderList.get(agentMemberId);
            listOld.addAll(list);
            agentOrderList.put(agentMemberId, listOld);
        }else{
            agentOrderList.put(agentMemberId, list);
        }
    }
}
