package com.example.model;

import java.util.Date;

public class V3MemberInfo {
    private Integer id;

    private Integer rMemberId;

    private Integer layer;

    private String relation;

    private String mobile;

    private String password;

    private String tradePassword;

    private String trueName;

    private String nickname;

    private String headImg;

    private Integer gender;

    private Boolean canChangeRemember;

    private String posterUrl;

    private Boolean status;

    private Integer spMemberId;

    private Date createdAt;

    private Date updatedAt;

    private Date recommededAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getrMemberId() {
        return rMemberId;
    }

    public void setrMemberId(Integer rMemberId) {
        this.rMemberId = rMemberId;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTradePassword() {
        return tradePassword;
    }

    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword == null ? null : tradePassword.trim();
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Boolean getCanChangeRemember() {
        return canChangeRemember;
    }

    public void setCanChangeRemember(Boolean canChangeRemember) {
        this.canChangeRemember = canChangeRemember;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl == null ? null : posterUrl.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getSpMemberId() {
        return spMemberId;
    }

    public void setSpMemberId(Integer spMemberId) {
        this.spMemberId = spMemberId;
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

    public Date getRecommededAt() {
        return recommededAt;
    }

    public void setRecommededAt(Date recommededAt) {
        this.recommededAt = recommededAt;
    }
}