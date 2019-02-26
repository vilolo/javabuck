package com.example.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.mapper.AreaListMapper;
import com.example.mapper.RegionMapper;
import com.example.mapper.SysAuthInfoMapper;
import com.example.model.AreaList;
import com.example.model.AreaListExample;
import com.example.model.Region;
import com.example.model.RegionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@Component
public class DemoHandle {

    @Autowired
    AreaListMapper areaListMapper;

    public void test(){
        //changeImgName();
        //test4();
        area2();
    }

    private void changeImgName(){
//        String dir = "F:/www/wx_img";
//        File files = new File(dir);
//        if (files.exists()){
//            for (File file : Objects.requireNonNull(files.listFiles())){
//                System.out.println(file.getName());
//            }
//        }
        downImg();
    }

    public static Thread tt(int bbb){
        System.out.println(bbb);
        return new Thread(() -> {
            for (int i = 0; i<5; i++){
                System.out.println(Thread.currentThread().getName()+"##"+i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, String.valueOf(bbb));
    }

    private void test4(){
        //List<Thread> threads = IntStream.range(1,5).mapToObj(DemoHandle::tt).collect(toList());
        List<Thread> threads = IntStream.range(1,5).mapToObj((x)->DemoHandle.tt(x)).collect(toList());
    }

    @Autowired
    SysAuthInfoMapper sysAuthInfoMapper;

    private Map<String, String> downImg(){
        List<Map<String,String>> list = sysAuthInfoMapper.wxImgList();
        String path = "F:/www/wx_img/build/";
        for(Map<String,String> map : list){
//            System.out.println(map.get("user_img"));
//            System.out.println(map.get("wx_openid"));
            String openid = map.get("wx_openid");
            String img = map.get("user_img");
            String suffix = img.substring(img.lastIndexOf("."), img.length());
            downloadPicture(map.get("user_img"), path+openid+suffix);
        }
        return null;
    }

    @Autowired
    RegionMapper regionMapper;

    //链接url下载图片
    private static void downloadPicture(String urlList,String path) {
        URL url = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());

            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test2(){
        StringBuffer areaJson = (new AreaListJson()).list3;
        JSONObject jsonObject = JSON.parseObject(areaJson.toString());
        JSONObject job = new JSONObject();
        Iterator<String> keys = jsonObject.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            RegionExample areaListExample = new RegionExample();
            RegionExample.Criteria criteria = areaListExample.createCriteria();
            criteria.andIdEqualTo(Integer.valueOf(key));
            List<Region> list = regionMapper.selectByExample(areaListExample);
            if (!list.isEmpty()){
                continue;
            }
            if (key.equals("86")){//省

            }else if (key.substring(2, key.length()).equals("0000")){//市

            }else if (key.substring(4, key.length()).equals("00")){//县

            }
        }
    }



//    public void test2(){
//        StringBuffer areaJson = (new AreaListJson()).list3;
//        JSONObject jsonObject = JSON.parseObject(areaJson.toString());
//
//        Map<String, Map<String, String>> map = jsonObject.toJavaObject(Map.class);
//        for (String key : map.keySet()) {
//            System.out.println("Key = " + key);
//        }
//    }

    public void test1(){
//        AreaListExample areaListExample = new AreaListExample();
//        int t = areaListMapper.countByExample(areaListExample);
//        System.out.println(t);
        //System.out.println(tt);

        StringBuffer areaJson = (new AreaListJson()).list;
        JSONArray jsonArray = JSON.parseArray(areaJson.toString());
        JSONObject job1 = new JSONObject();
        JSONObject job2 = new JSONObject();
        JSONObject job3 = new JSONObject();
        JSONObject job4 = new JSONObject();
        JSONArray a1 = new JSONArray();
        JSONArray a2 = new JSONArray();
        JSONArray a3 = new JSONArray();
        String id = "";
        String id2 = "";
        String id3 = "";
        String name = "";
        String pingyin = "";
        AreaList areaList = new AreaList();
        for (int i=0; i<jsonArray.size(); i++){
            job1 = jsonArray.getJSONObject(i);
            a1 = job1.getJSONArray("list");
            pingyin = job1.get("pingyin").toString();
            for (int j=0; j<a1.size(); j++){
                areaList = new AreaList();
                job2 = a1.getJSONObject(j);
                id = job2.get("id").toString();
                name = job2.get("name").toString();
                a2 = job2.getJSONArray("citys");
                System.out.println(id + "===" + name);
                areaList.setId(Integer.valueOf(id));
                areaList.setName(name);
                areaList.setAlphabet(pingyin);
                areaList.setType((byte) 1);
                areaList.setIdList(id);
                areaListMapper.insert(areaList);
                for (int z=0; z<a2.size(); z++){
                    areaList = new AreaList();
                    job3 = a2.getJSONObject(z);
                    id2 = job3.get("id").toString();
                    name = job3.get("name").toString();
                    a3 = job3.getJSONArray("areas");
                    System.out.println(id2 + "===" + name);
                    areaList.setId(Integer.valueOf(id2));
                    areaList.setName(name);
                    areaList.setAlphabet(pingyin);
                    areaList.setType((byte) 2);
                    areaList.setIdList(id+","+id2);
                    areaListMapper.insert(areaList);
                    for (int w=0; w<a3.size(); w++){
                        areaList = new AreaList();
                        job4 = a3.getJSONObject(w);
                        id3 = job4.get("id").toString();
                        name = job4.get("name").toString();
                        System.out.println(id3 + "===" + name);
                        areaList.setId(Integer.valueOf(id3));
                        areaList.setName(name);
                        areaList.setAlphabet(pingyin);
                        areaList.setType((byte) 3);
                        areaList.setIdList(id+","+id2+","+id3);
                        areaListMapper.insert(areaList);
                    }
                }
            }
        }
    }

    private void area2(){
        StringBuffer areaJson = (new AreaListJson2()).list;
        JSONObject jsonObject = JSON.parseObject(areaJson.toString());

        //省
        JSONObject p_list = JSON.parseObject(jsonObject.getJSONObject("86").toString());
        for (String key : p_list.keySet()){//市
            BigInteger pCode = BigInteger.valueOf(Long.valueOf(key));
            String pName = p_list.getString(key);

            //省
            Region region = new Region();
            region.setId(pCode);
            region.setName(pName);
            region.setType((byte)1);
            region.setIdList(pCode.toString());
            regionMapper.insert(region);

            if (jsonObject.getJSONObject(key) == null){
                continue;
            }

            JSONObject c_list = JSON.parseObject(jsonObject.getJSONObject(key).toString());
            for (String cKey : c_list.keySet()){//县
                BigInteger cCode = BigInteger.valueOf(Long.valueOf(cKey));
                String cName = c_list.getString(cKey);

                Region cRegion = new Region();
                cRegion.setId(cCode);
                cRegion.setName(cName);
                cRegion.setType((byte)2);
                cRegion.setIdList(pCode.toString()+","+cCode.toString());
                regionMapper.insert(cRegion);
                if (jsonObject.getJSONObject(cKey) == null){
                    continue;
                }
                JSONObject a_list = JSON.parseObject(jsonObject.getJSONObject(cKey).toString());
                for (String aKey : a_list.keySet()){//镇
                    BigInteger aCode = BigInteger.valueOf(Long.valueOf(aKey));
                    String aName = a_list.getString(aKey);

                    Region aRegion = new Region();
                    aRegion.setId(aCode);
                    aRegion.setName(aName);
                    aRegion.setType((byte)3);
                    aRegion.setIdList(pCode.toString()+","+cCode.toString()+","+aCode.toString());
                    regionMapper.insert(aRegion);

                    JSONObject z_json = jsonObject.getJSONObject(aKey);
                    if (z_json != null){
                        //System.out.println(z_json);
                        JSONObject z_list = JSON.parseObject(z_json.toString());
                        for (String zKey : z_list.keySet()){
                            BigInteger zCode = BigInteger.valueOf(Long.valueOf(zKey));
                            String zName = z_list.getString(zKey);

                            Region zRegion = new Region();
                            zRegion.setId(zCode);
                            zRegion.setName(zName);
                            zRegion.setType((byte)4);
                            zRegion.setIdList(pCode.toString()+","+cCode.toString()+","+aCode.toString()+","+zCode.toString());
                            //regionMapper.insert(zRegion);

                            //System.out.println(z_list.getJSONObject(zKey).toString());
                            System.out.println("=========");
                            System.out.println(pCode+pName+cCode+cName+aCode+aName+zCode+zName);
                        }
                    }else{
                        System.out.println(pCode+pName+cCode+cName+aCode+aName);
                    }
                }
            }
        }
    }

}
