package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class V3OrderGoodsInfo {
    private Integer id;

    private Integer orderId;

    private Integer shopMemberId;

    private Byte memberLevel;

    private Integer goodsId;

    private Integer agentGoodsId;

    private Integer agentGoodsNumber;

    private String goodsName;

    private Boolean goodsLevel;

    private BigDecimal goodsProfitRate;

    private Integer saleCount;

    private BigDecimal goodsAmount;

    private Byte state;

    private Boolean profitStatus;

    private String profitRemark;

    private Integer receivedAt;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getShopMemberId() {
        return shopMemberId;
    }

    public void setShopMemberId(Integer shopMemberId) {
        this.shopMemberId = shopMemberId;
    }

    public Byte getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Byte memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAgentGoodsId() {
        return agentGoodsId;
    }

    public void setAgentGoodsId(Integer agentGoodsId) {
        this.agentGoodsId = agentGoodsId;
    }

    public Integer getAgentGoodsNumber() {
        return agentGoodsNumber;
    }

    public void setAgentGoodsNumber(Integer agentGoodsNumber) {
        this.agentGoodsNumber = agentGoodsNumber;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Boolean getGoodsLevel() {
        return goodsLevel;
    }

    public void setGoodsLevel(Boolean goodsLevel) {
        this.goodsLevel = goodsLevel;
    }

    public BigDecimal getGoodsProfitRate() {
        return goodsProfitRate;
    }

    public void setGoodsProfitRate(BigDecimal goodsProfitRate) {
        this.goodsProfitRate = goodsProfitRate;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Boolean getProfitStatus() {
        return profitStatus;
    }

    public void setProfitStatus(Boolean profitStatus) {
        this.profitStatus = profitStatus;
    }

    public String getProfitRemark() {
        return profitRemark;
    }

    public void setProfitRemark(String profitRemark) {
        this.profitRemark = profitRemark == null ? null : profitRemark.trim();
    }

    public Integer getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Integer receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}