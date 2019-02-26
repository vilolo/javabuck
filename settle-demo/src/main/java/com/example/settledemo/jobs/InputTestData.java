package com.example.settledemo.jobs;

import redis.clients.jedis.Jedis;


public class InputTestData {

    public static void main(String[] args){
        addTestData();
    }

    private static void addTestData(){
        String listKey = "settle";
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        jedis.rpush(listKey, "{goodsId:123,price:100,openId:'abc'}");
        jedis.rpush(listKey, "{goodsId:123,price:100,openId:'ddd'}");

        jedis.close();
    }
}
