package com.example.task;

import com.example.mapper.AreaAgentMapper;
import com.example.mapper.MemberMapper;
import com.example.model.AreaAgent;
import com.example.model.Member;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class AgentInfo {

    @Autowired
    MemberMapper memberMapper;

    @Autowired
    AreaAgentMapper areaAgentMapper;

    public void index(){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("sheet1");
        HSSFRow rowRowName = sheet.createRow(0);

        HSSFCell rr = rowRowName.createCell(0);
        rr.setCellValue("标题");

        //获取所有市
        List<AreaAgent> cityList = areaAgentMapper.getLevelList(2);

        //获取所有省
        List<AreaAgent> provinceList = areaAgentMapper.getLevelList(3);

        HSSFCellStyle style2 = workbook.createCellStyle();
        style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  //填充单元格
        style2.setFillForegroundColor(HSSFColor.CORNFLOWER_BLUE.index);

        Integer i = 1;
        for (AreaAgent item:
             cityList) {
            //System.out.println(item.getAreaIds());

            //System.out.println(i+1);
//            HSSFRow tempRow = sheet.createRow(i);
//            tempRow.setRowStyle(style2);
//            i++;

            Map<String, Object> memberInfo = memberMapper.getMemberInfo(item.getMemberId());
            HSSFRow row = sheet.createRow(i);
            row.createCell(0).setCellValue(memberInfo.get("id").toString());
            row.createCell(1).setCellValue(memberInfo.get("name")!=null?memberInfo.get("name").toString():"");
            row.createCell(2).setCellValue(memberInfo.get("nickname")!=null?memberInfo.get("nickname").toString():"");
            row.createCell(3).setCellValue(memberInfo.get("mobile").toString());
            row.createCell(4).setCellValue(memberInfo.get("agent_area")!=null?memberInfo.get("agent_area").toString():"");
            row.createCell(5).setCellValue(memberInfo.get("area_name")!=null?memberInfo.get("area_name").toString():"");
            row.createCell(6).setCellValue(memberInfo.get("r_id").toString());
            row.createCell(7).setCellValue(memberInfo.get("r_name")!=null?memberInfo.get("r_name").toString():"");
            row.createCell(8).setCellValue(memberInfo.get("r_mobile").toString());
            row.createCell(9).setCellValue(memberInfo.get("relations").toString());
            i++;

            //查询他下面的所有用户，不包含他自己
            List<Member> childMember = memberMapper.getRelationsMember(item.getMemberId());
            for (Member m:
                 childMember) {
                boolean hasCityOrProvince = false;

                //替换relations
                String tempRelations = m.getRelations().replace(item.getAreaIds(),"");

                //排除里面包含市代
                for (AreaAgent c:
                     cityList) {
                    if (tempRelations.contains("," + c.getMemberId())){
                        hasCityOrProvince = true;
                        break;
                    }
                }

                if (hasCityOrProvince){
                    //System.out.println("XXXXX"+m.getRelations());
                    continue;
                }else{
                    for (AreaAgent c:
                            provinceList) {
                        if (tempRelations.contains("," + c.getMemberId())){
                            hasCityOrProvince = true;
                            break;
                        }
                    }
                }

                if (!hasCityOrProvince){
                    //System.out.println("√√√√√"+m.getRelations());
                    Map<String, Object> childInfo = memberMapper.getMemberInfo(m.getId());
                    HSSFRow row2 = sheet.createRow(i);
                    row2.createCell(0).setCellValue(childInfo.get("id").toString());
                    row2.createCell(1).setCellValue(childInfo.get("name")!=null?childInfo.get("name").toString():"");
                    row2.createCell(2).setCellValue(childInfo.get("nickname")!=null?childInfo.get("nickname").toString():"");
                    row2.createCell(3).setCellValue(childInfo.get("mobile")!=null?childInfo.get("mobile").toString():"");
                    row2.createCell(4).setCellValue(childInfo.get("agent_area")!=null?childInfo.get("agent_area").toString():"");
                    row2.createCell(5).setCellValue(childInfo.get("area_name")!=null?childInfo.get("area_name").toString():"");
                    row2.createCell(6).setCellValue(childInfo.get("r_id").toString());
                    row2.createCell(7).setCellValue(childInfo.get("r_name")!=null?childInfo.get("r_name").toString():"");
                    row2.createCell(8).setCellValue(childInfo.get("r_mobile")!=null?childInfo.get("r_mobile").toString():"");
                    row2.createCell(9).setCellValue(childInfo.get("relations").toString());
                    i++;
                }
            }
        }

        FileOutputStream out = null;
        try {
            //out = new FileOutputStream("F:/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString() +".xls");
            out = new FileOutputStream("F:/市级推荐关系表4.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
