package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class V3ProfitLog {
    private Integer id;

    private Integer memberId;

    private Integer memberLevel;

    private String areaIds;

    private Integer profitType;

    private Integer status;

    private Integer assetsType;

    private Integer fromGoodsId;

    private Integer fromAgentGoodsId;

    private Integer fromOrderId;

    private Integer fromMemberId;

    private Integer fromMemberLevel;

    private BigDecimal goodsPrice;

    private Integer saleCount;

    private BigDecimal goodsProfitRate;

    private BigDecimal profitPrice;

    private BigDecimal rate;

    private BigDecimal amount;

    private String remark;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    public String getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(String areaIds) {
        this.areaIds = areaIds == null ? null : areaIds.trim();
    }

    public Integer getProfitType() {
        return profitType;
    }

    public void setProfitType(Integer profitType) {
        this.profitType = profitType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(Integer assetsType) {
        this.assetsType = assetsType;
    }

    public Integer getFromGoodsId() {
        return fromGoodsId;
    }

    public void setFromGoodsId(Integer fromGoodsId) {
        this.fromGoodsId = fromGoodsId;
    }

    public Integer getFromAgentGoodsId() {
        return fromAgentGoodsId;
    }

    public void setFromAgentGoodsId(Integer fromAgentGoodsId) {
        this.fromAgentGoodsId = fromAgentGoodsId;
    }

    public Integer getFromOrderId() {
        return fromOrderId;
    }

    public void setFromOrderId(Integer fromOrderId) {
        this.fromOrderId = fromOrderId;
    }

    public Integer getFromMemberId() {
        return fromMemberId;
    }

    public void setFromMemberId(Integer fromMemberId) {
        this.fromMemberId = fromMemberId;
    }

    public Integer getFromMemberLevel() {
        return fromMemberLevel;
    }

    public void setFromMemberLevel(Integer fromMemberLevel) {
        this.fromMemberLevel = fromMemberLevel;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public BigDecimal getGoodsProfitRate() {
        return goodsProfitRate;
    }

    public void setGoodsProfitRate(BigDecimal goodsProfitRate) {
        this.goodsProfitRate = goodsProfitRate;
    }

    public BigDecimal getProfitPrice() {
        return profitPrice;
    }

    public void setProfitPrice(BigDecimal profitPrice) {
        this.profitPrice = profitPrice;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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