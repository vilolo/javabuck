package com.example.spider.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.spider.model.ItemModel;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component
public class AlibabaController {
    public void index(){
        test();
    }

    private void test(){
        String[] urlList = {
                //"https://detail.1688.com/offer/574133818792.html?spm=a2615.2177701.autotrace-limitDiscount.17.d17027890fsw5E",
                //"https://detail.1688.com/offer/556287022875.html?spm=a261y.7663282.hotsale.2.1fba2c28nVVUgH",
                //"https://detail.1688.com/offer/568669576979.html?spm=a261y.7663282.1998411376.1.48a6687c7rJv21&scm=1007.19151.114112.0",
                //"https://detail.1688.com/offer/570507156275.html?spm=a261y.7663282.autotrace-offerDetailContext1.19.e50a266f8M9MkW&sk=",
                //"https://detail.1688.com/offer/566633806282.html?spm=a261y.7663282.1998411376.1.7bc35c26q0TcuK&scm=1007.19151.114112.0",
                //"https://detail.1688.com/offer/587648146623.html?spm=a261y.7663282.autotrace-offerDetailContext1.30.742b7442e2uY5k&sk=",
                "https://detail.1688.com/offer/552629922218.html?spm=a261y.7663282.1998411376.2.364a74421dUgc6&scm=1007.19151.114112.0",
                "https://detail.1688.com/offer/589291952997.html?spm=a26286.8292837.0.0.3dc5749f5grgg8",
                "https://detail.1688.com/offer/570134933850.html?spm=a2615.7691456.autotrace-offerGeneral.46.31c54d08kel1xf",
                "https://detail.1688.com/offer/564957455213.html?spm=a2615.7691456.autotrace-offerGeneral.19.32b34d08A0BMgx",
                "https://detail.1688.com/offer/593447903678.html?spm=a26286.8292837.0.0.5f49749fcJBLWm",
                "https://detail.1688.com/offer/574504988944.html?spm=a261y.7663282.autotrace-offerDetailContext1.14.171611dd0vjvhR&sk=consign",
                "https://detail.1688.com/offer/587633466477.html?spm=a2615.7691456.autotrace-offerGeneral.1.424a4d08LV8UOY",
                "https://detail.1688.com/offer/555698872842.html?spm=a2615.7691456.autotrace-offerGeneral.19.2f524d0855Xulw",
                "https://detail.1688.com/offer/568791775543.html?spm=a2615.7691456.autotrace-offerGeneral.7.1abd4d08sqRAZP",
                "https://detail.1688.com/offer/566127124313.html?spm=a2615.7691456.autotrace-offerGeneral.10.1abd4d08sqRAZP"
        };

        for (int i = 0; i < urlList.length; i++) {
            String url = urlList[i];
            try {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\feng\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");//chromedriver服务地址
                WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
                driver.get(url);//打开指定的网站
                //driver.get("https://tieba.baidu.com/index.html");//打开指定的网站

                String html = "";
                try {
                    /**
                     * WebDriver自带了一个智能等待的方法。
                     dr.manage().timeouts().implicitlyWait(arg0, arg1）；
                     Arg0：等待的时间长度，int 类型 ；
                     Arg1：等待时间的单位 TimeUnit.SECONDS 一般用秒作为单位。
                     */
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //Document doc = Jsoup.connect(url).get();
                Document doc = Jsoup.parse(driver.getPageSource());
                String title = doc.select(".d-title").text().substring(0,20);
                String dirPath = "C:\\Users\\feng\\my_file\\fei\\"+title;
                String dirDetailPath = dirPath+"\\详情图";
                File file = new File(dirPath);
                if (!file.exists()){
                    file.mkdir();
                }
                File file2 = new File(dirDetailPath);
                if (!file2.exists()){
                    file2.mkdir();
                }
                Elements img1 = doc.select("#dt-tab li");

                int ri = 0;
                HSSFWorkbook wb = new HSSFWorkbook();
                HSSFSheet sheet = wb.createSheet("数据1");

                HSSFRow row1 = sheet.createRow(ri);
                row1.createCell(0).setCellValue("展示图:");
                ri++;
                for (Element e:
                     img1) {
                    String data = e.attr("data-imgs");
                    Object object = JSON.parseObject(data);
                    String previewImg = ((JSONObject) object).getString("preview");
                    String originalImg = ((JSONObject) object).getString("original");

                    HSSFRow row5 = sheet.createRow(ri);
                    row5.createCell(0).setCellValue(originalImg);

                    String[] split = originalImg.split("\\/");
                    String fileName = split[split.length - 1];
                    this.download(originalImg, dirPath+"/"+fileName);

                    ri++;
                }

                ri++;
                HSSFRow row3 = sheet.createRow(ri);
                row3.createCell(0).setCellValue("详情图");
                ri++;

                String js1 = "window.scrollTo(0, 500);";
                String js2 = "window.scrollTo(500, 1000);";
                String js3 = "window.scrollTo(1000, 1300);";
                String js4 = "window.scrollTo(1300, 1900);";

                ((ChromeDriver) driver).executeScript(js1);
                Thread.sleep(1000L);
                ((ChromeDriver) driver).executeScript(js2);
                Thread.sleep(1000L);
                ((ChromeDriver) driver).executeScript(js3);
                Thread.sleep(1000L);
                ((ChromeDriver) driver).executeScript(js4);
                Thread.sleep(1000L);

                //详情
                doc = Jsoup.parse(driver.getPageSource());
                Thread.sleep(1000L);
                Elements detailImgs = doc.select("#desc-lazyload-container img");
                for (Element e:
                     detailImgs) {
                    String src = e.attr("src");
                    if (src.indexOf("http") == -1){
                        continue;
                    }

                    HSSFRow row2 = sheet.createRow(ri);
                    row2.createCell(0).setCellValue(src);
                    ri++;
                    String[] split = src.split("\\/");
                    String fileName = split[split.length - 1];
                    this.download(src, dirPath+"/详情图/"+fileName);
                }

                FileOutputStream fileOut;
                fileOut = new FileOutputStream(dirPath+"\\"+title+".xls");
                wb.write(fileOut);
                fileOut.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 下载文件到本地
     *
     * @param urlString
     *          被下载的文件地址
     * @param filename
     *          本地文件名
     * @throws Exception
     *           各种异常
     */
    private void download(String urlString, String filename) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        // 输入流
        InputStream is = con.getInputStream();
        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        OutputStream os = new FileOutputStream(filename);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // 完毕，关闭所有链接
        os.close();
        is.close();
    }
}
