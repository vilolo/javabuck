package com.example.exceldemo.mzmall;

import com.example.exceldemo.mzmall.service.RegionService;
import com.example.mapper.AreaListMapper;
import com.example.model.JxsExcel;
import com.example.model.Region;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class InExcel {

    @Autowired
    RegionService regionService;

    public void ImporeJxsData(){
        try {
            InputStream is = new FileInputStream("F:/javawww/buck/excel-demo/src/main/resources/data/jxs-data.xlsx");
            Workbook xssfWorkbook = new XSSFWorkbook(is);
            XSSFSheet xssfSheet = (XSSFSheet) xssfWorkbook.getSheetAt(0);
            List<JxsExcel> jxsExcelList = new ArrayList<>();
            Integer time = this.getSecondTimestamp(new Date());
            for (int i = 2; i <= xssfSheet.getLastRowNum(); i++) {
                JxsExcel jxsExcel = new JxsExcel();
                XSSFRow xssfRow = xssfSheet.getRow(i);
                XSSFCell phone = xssfRow.getCell(6);
                if (phone == null){
                    continue;
                }

//                private String userName;
//                private int provinceId;
//                private int cityId;
//                private int areaId;
//                private int agentLevel;
//                private String phone;
//                private String recommendPhone;
//                private String recommendName;
//                private int createTime;

                jxsExcel.setPhone(phone.toString());
                jxsExcel.setUserName(xssfRow.getCell(1).toString());

                String agentArea = xssfRow.getCell(9).toString();
                String agentAddress = null;
                Integer areaLevel = 0;
                switch (agentArea){
                    case "省代理":
                        jxsExcel.setAgentLevel(6);
                        areaLevel = 1;
                        agentAddress = xssfRow.getCell(3).toString();
                        break;
                    case "市代理":
                        jxsExcel.setAgentLevel(5);
                        areaLevel = 2;
                        agentAddress = xssfRow.getCell(4).toString();
                        break;
                    case "区/县代理":
                        jxsExcel.setAgentLevel(4);
                        areaLevel = 3;
                        agentAddress = xssfRow.getCell(5)==null?"其他区":xssfRow.getCell(5).toString();
                        break;
                }

                //查询代理地址id
                Region region = regionService.getRegionByName(agentAddress, areaLevel);
                jxsExcel.setAreaIds(region.getIdList());
                jxsExcel.setCreateTime(time);



                jxsExcelList.add(jxsExcel);
            }

            for (JxsExcel j : jxsExcelList){
                System.out.println(j.getUserName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getSecondTimestamp(Date date){
        if (null == date) {
            return 0;
        }
        String timestamp = String.valueOf(date.getTime()/1000);
        return Integer.valueOf(timestamp);
    }

    @Autowired
    AreaListMapper areaListMapper;

    public void InputPhone(){
        try {
            InputStream is = new FileInputStream("F:/javawww/buck/excel-demo/src/main/resources/data/transfer-data2.xlsx");
            Workbook xssfWorkbook = new XSSFWorkbook(is);
            XSSFSheet xssfSheet = (XSSFSheet) xssfWorkbook.getSheetAt(0);
            for (int i = 1; i <= xssfSheet.getLastRowNum(); i++) {
                XSSFRow xssfRow = xssfSheet.getRow(i);
                DecimalFormat df = new DecimalFormat("0");
                String fromPhone = df.format(xssfRow.getCell(0).getNumericCellValue());
                String toPhone = df.format(xssfRow.getCell(1).getNumericCellValue());
                System.out.println(i+":"+fromPhone+"  to  "+toPhone);

                areaListMapper.insertTempTable(fromPhone, toPhone);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
