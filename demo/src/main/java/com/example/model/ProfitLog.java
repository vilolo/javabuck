package com.example.model;

import java.math.BigDecimal;

public class ProfitLog {
    private Long id;

    private Integer memberId;

    private Short memberLevel;

    private Byte type;

    private Byte moneyType;

    private Integer fromOrderId;

    private Integer fromMemberId;

    private Short fromMemberLevel;

    private BigDecimal money;

    private String remark;

    private Integer status;

    private Integer createdAt;

    private Integer updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Short getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Short memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(Byte moneyType) {
        this.moneyType = moneyType;
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

    public Short getFromMemberLevel() {
        return fromMemberLevel;
    }

    public void setFromMemberLevel(Short fromMemberLevel) {
        this.fromMemberLevel = fromMemberLevel;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }
}