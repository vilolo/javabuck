package com.example.settledemo.jobs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.settledemo.SettleDemoApplication;
import com.example.settledemo.modules.goods.dao.mapper.GoodsMapper;
import com.example.settledemo.modules.goods.entity.Goods;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

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

    void index(){
        Goods goods = goodsMapper.selectById("1");
        System.out.println(goods.getGoodsImage());
        while (true){
            //循环redis list
            String json = redisTemplate.opsForList().rightPop(listKey);
            if (json != null){
                JSONObject data = JSON.parseObject(json);
                if (data != null){
                    Order order = JSONObject.toJavaObject(data, Order.class);
                    if (order != null && order.getOpenId() != null){
                        System.out.println(order.getOpenId());
                        handleOrder(order);
                    }else{
                        System.out.println("[data to order error]"+data.toString());
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

    private synchronized void handleOrder(Order order){
        //分析商品属性：会员商品/普通商品
        boolean isVipGoods = true;
        if (isVipGoods){
            settleVipGoods(order);
        }else{
            settleNormalGoods(order);
        }

    }

    //结算会员商品
    private void settleVipGoods(Order order){

    }

    //结算普通商品
    private void settleNormalGoods(Order order){

    }


}
