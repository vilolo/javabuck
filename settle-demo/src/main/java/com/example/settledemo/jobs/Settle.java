package com.example.settledemo.jobs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.settledemo.modules.goods.dao.mapper.GoodsMapper;
import com.example.settledemo.modules.goods.entity.Goods;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Settle {

    private static Logger logger = Logger.getLogger(Settle.class);

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Autowired(required = false)
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        this.redisTemplate = redisTemplate;
    }

    private String listKey = "settle";

    @Autowired
    GoodsMapper goodsMapper;

    Map<Integer, Map<String, String>> settleMemberList = new HashMap<>();

    void index(){
        Goods goods = goodsMapper.selectById("1");
        System.out.println(goods.getGoodsImage());
        logger.info("123123");
        while (true){
            //循环redis list
            String json = redisTemplate.opsForList().rightPop(listKey);
            if (json != null){
                JSONObject data = JSON.parseObject(json);
                if (data != null){
                    OrderEnpty orderEnpty = JSONObject.toJavaObject(data, OrderEnpty.class);
                    if (orderEnpty != null && orderEnpty.getOpenId() != null){
                        System.out.println(orderEnpty.getOpenId());
                        handleOrder(orderEnpty);
                    }else{
                        System.out.println("[data to orderEnpty error]"+data.toString());
                    }
                }else {
                    System.out.println("[to json error]"+json);
                }
            }else {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private synchronized void handleOrder(OrderEnpty orderEnpty){
        //分析商品属性：会员商品/普通商品
        boolean isVipGoods = true;
        if (isVipGoods){
            //根据收货地址分润
            settleByAddress();

            settleVipGoods(orderEnpty);
        }else{
            settleNormalGoods(orderEnpty);
        }
    }

    //结算会员商品
    private void settleVipGoods(OrderEnpty orderEnpty){

        //查找用户关系链

        //查找关系链，对应商品的对应用户信息

        //定义分润最大进度（注意如果直接跳过了店长，到区县以上渠道商，需补店长）：0=初始未分，1=会员，2=店长，3=平级店长，4=区县，5=区县同级，6=市，7=市同级，8=省，9=省同级
        int maxStep = 3;
        //定义分销商分润初始进度
        int curStep=0;

        //从后向前循环关系链

        //第一个用户是本人，判断身份是否大于游客
            //会员5%
            //店长10%
            //渠道商？

        //继续循环，当大于maxStep，完成分润

        //期间记录每个分润用户及比例，普通商品结算需要用到
        //settleMemberList
    }

    //结算普通商品
    private void settleNormalGoods(OrderEnpty orderEnpty){
        //确定店铺等级
        //佣金总额=商品售价*返佣比例
        //60% * 店铺等级对应比例 给到店铺
        //40% * 店铺等级对应比例 按照 会员商品的结算比例
        //settleMemberList
    }

    //根据收货地址分润
    private void settleByAddress(){

    }


}
