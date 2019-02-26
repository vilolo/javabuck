package com.example.settledemo.jobs;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable {
    private Integer goodsId;
    private String openId;
    private BigDecimal price;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
