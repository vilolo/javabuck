package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class V3OrderInfo {
    private Integer id;

    private String sn;

    private Integer shopMemberId;

    private Integer shopLevel;

    private Integer payMemberId;

    private String payMemberRelation;

    private BigDecimal paymentAmount;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

    private String address;

    private Date paymentTime;

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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getShopMemberId() {
        return shopMemberId;
    }

    public void setShopMemberId(Integer shopMemberId) {
        this.shopMemberId = shopMemberId;
    }

    public Integer getShopLevel() {
        return shopLevel;
    }

    public void setShopLevel(Integer shopLevel) {
        this.shopLevel = shopLevel;
    }

    public Integer getPayMemberId() {
        return payMemberId;
    }

    public void setPayMemberId(Integer payMemberId) {
        this.payMemberId = payMemberId;
    }

    public String getPayMemberRelation() {
        return payMemberRelation;
    }

    public void setPayMemberRelation(String payMemberRelation) {
        this.payMemberRelation = payMemberRelation == null ? null : payMemberRelation.trim();
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
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