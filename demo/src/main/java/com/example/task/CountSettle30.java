package com.example.task;

import com.example.mapper.V3MemberAgentMapper;
import com.example.mapper.V3MemberInfoMapper;
import com.example.mapper.V3OrderGoodsInfoMapper;
import com.example.model.ShopOrder;
import com.example.model.V3MemberAgent;
import com.example.model.V3MemberInfo;
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
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class CountSettle30 {

    private Map<String, List<Map<String, Object>>> orderMap = new HashMap<>();

    @Autowired
    V3MemberAgentMapper v3MemberAgentMapper;

    @Autowired
    V3OrderGoodsInfoMapper v3OrderGoodsInfoMapper;

    @Autowired
    V3MemberInfoMapper v3MemberInfoMapper;

    public void index() {
        String startTime = "20190101";
        String endTime = "20190531";
        Integer startTimestemp = Integer.valueOf(String.valueOf(date2TimeStamp(startTime, "yyyyMMdd")));
        Integer endTimestemp = Integer.valueOf(String.valueOf(date2TimeStamp(endTime+"-23:59:59", "yyyyMMdd-HH:mm:ss")))+1;

        //导出数据
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("sheet1");
        HSSFRow rowRowName = sheet.createRow(0);

        HSSFCell rr = rowRowName.createCell(0);
        rr.setCellValue("台头");

        //查询所有渠道商
        List<V3MemberAgent> v3MemberAgents = v3MemberAgentMapper.selectAgentList();
        for (V3MemberAgent m:
             v3MemberAgents) {
            //递归查询直推分润列表
            rGetOrderGoodsInfo(m.getMemberId(), m.getMemberId());
        }

        int j = 4;
        for (String key : orderMap.keySet()) {
            //获取用户信息
            V3MemberInfo memberInfo = v3MemberInfoMapper.selectByPrimaryKey(Integer.valueOf(key));

            //获取最高代理信息
            System.out.println(Integer.valueOf(key));
            V3MemberAgent memberAgent = v3MemberAgentMapper.getHighestAgentLevel(Integer.valueOf(key));
            HSSFRow link = sheet.createRow(j);
            int lie = 0;
            link.createCell(lie).setCellValue(j-3);
            //UID，真实姓名，昵称，最高代理级别，代理区域，总业绩，创建时间
            lie++;link.createCell(lie).setCellValue(memberInfo.getId());
            lie++;link.createCell(lie).setCellValue(memberInfo.getTrueName());
            lie++;link.createCell(lie).setCellValue(memberInfo.getNickname());
            String levelName = "";
            switch (memberAgent.getLevelId()){
                case 3:
                    levelName = "区县代理";
                    break;
                case 4:
                    levelName = "市代理";
                    break;
                case 5:
                    levelName = "省代理";
                    break;
                default:
                    levelName = "未知";
            }
            lie++;link.createCell(lie).setCellValue(levelName);
            lie++;link.createCell(lie).setCellValue(memberAgent.getAreaNames());

            //总金额
            BigDecimal totalMoney = new BigDecimal(0);

            for (Map<String, Object> order:orderMap.get(key)) {
                if (order.size() == 0){
                    continue;
                }
                Integer ttt = StringToTimestamp((String) order.get("tt"));
                if (ttt>=startTimestemp && ttt<=endTimestemp){
                    totalMoney = totalMoney.add(new BigDecimal(order.get("sale_count").toString()).multiply(new BigDecimal(order.get("goods_amount").toString())));
                }
            }
            lie++;link.createCell(lie).setCellValue(totalMoney.toString());
            j++;
        }

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("F:/3.0渠道商业绩统计-（"+startTime+"-"+endTime+"）"+".xls");
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

    private void rGetOrderGoodsInfo(Integer agentMemberId, Integer childMemberId){
        orderMap.put(agentMemberId.toString(), new ArrayList<>());
        List<Map<String,Object>> mapList = v3OrderGoodsInfoMapper.rGetOrderGoodsInfo(childMemberId);
        List<Map<String,Object>> tempList = new ArrayList<>();
        if (mapList.size() > 0){
            if (orderMap.get(agentMemberId.toString()) == null){
                orderMap.put(agentMemberId.toString(), mapList);
            }else{
                tempList.addAll(orderMap.get(agentMemberId.toString()));
                tempList.addAll(mapList);
                orderMap.put(agentMemberId.toString(), tempList);
            }

            for (Map<String,Object> mm: mapList) {
                if (agentMemberId == 20821){
                    System.out.println(mm.get("id"));
                }
                if (!orderMap.containsKey(mm.get("from_member_id").toString()) && !childMemberId.equals(Integer.valueOf(mm.get("from_member_id").toString()) )){
                    rGetOrderGoodsInfo(agentMemberId, Integer.valueOf(mm.get("from_member_id").toString()));
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "123,456,789,5466,78,999";
        String targe = "789";
        int ss = str.indexOf(targe);
        System.out.println(str.substring(0, ss));
        System.out.println(str.substring(0, ss+targe.length()));
    }

    private void rGetOrderByRecommendId(Integer agentMemberId, Integer childMemberId){
        //获取用户等级

        //获取直推列表

    }

    /**
     * 日期格式字符串转换成时间戳
     *
     * @param date_str 字符串日期
     * @param format   如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    private Long date2TimeStamp(String date_str, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(date_str).getTime() / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0L;
    }

    /**
     * String(yyyy-MM-dd HH:mm:ss)转10位时间戳
     * @param time
     * @return
     */
    public static Integer StringToTimestamp(String time){

        int times = 0;
        try {
            times = (int) ((Timestamp.valueOf(time).getTime())/1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(times==0){
            System.out.println("String转10位时间戳失败");
        }
        return times;

    }
}
