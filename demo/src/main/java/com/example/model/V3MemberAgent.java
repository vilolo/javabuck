package com.example.model;

import java.util.Date;

public class V3MemberAgent {
    private Integer id;

    private Integer memberId;

    private Integer agentGoodsId;

    private Integer levelId;

    private String areaNames;

    private String areaIds;

    private Boolean status;

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

    public Integer getAgentGoodsId() {
        return agentGoodsId;
    }

    public void setAgentGoodsId(Integer agentGoodsId) {
        this.agentGoodsId = agentGoodsId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getAreaNames() {
        return areaNames;
    }

    public void setAreaNames(String areaNames) {
        this.areaNames = areaNames == null ? null : areaNames.trim();
    }

    public String getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(String areaIds) {
        this.areaIds = areaIds == null ? null : areaIds.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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