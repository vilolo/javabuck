package com.example.model;

import java.util.Date;

public class SysAuthInfo {
    private Integer id;

    private Integer userId;

    private String wxOpenid;

    private String wxUnionid;

    private String wxRefreshToken;

    private String wbUid;

    private String wbAccessToken;

    private Byte authType;

    private Byte statusId;

    private Integer tradingId;

    private Date createTime;

    private Date updateTime;

    private Integer companyId;

    private Integer platFormId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    public String getWxUnionid() {
        return wxUnionid;
    }

    public void setWxUnionid(String wxUnionid) {
        this.wxUnionid = wxUnionid == null ? null : wxUnionid.trim();
    }

    public String getWxRefreshToken() {
        return wxRefreshToken;
    }

    public void setWxRefreshToken(String wxRefreshToken) {
        this.wxRefreshToken = wxRefreshToken == null ? null : wxRefreshToken.trim();
    }

    public String getWbUid() {
        return wbUid;
    }

    public void setWbUid(String wbUid) {
        this.wbUid = wbUid == null ? null : wbUid.trim();
    }

    public String getWbAccessToken() {
        return wbAccessToken;
    }

    public void setWbAccessToken(String wbAccessToken) {
        this.wbAccessToken = wbAccessToken == null ? null : wbAccessToken.trim();
    }

    public Byte getAuthType() {
        return authType;
    }

    public void setAuthType(Byte authType) {
        this.authType = authType;
    }

    public Byte getStatusId() {
        return statusId;
    }

    public void setStatusId(Byte statusId) {
        this.statusId = statusId;
    }

    public Integer getTradingId() {
        return tradingId;
    }

    public void setTradingId(Integer tradingId) {
        this.tradingId = tradingId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getPlatFormId() {
        return platFormId;
    }

    public void setPlatFormId(Integer platFormId) {
        this.platFormId = platFormId;
    }
}