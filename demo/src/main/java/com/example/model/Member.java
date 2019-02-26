package com.example.model;

import java.math.BigDecimal;

public class Member {
    private Integer id;

    private Integer rMemberId;

    private Integer layer;

    private String relations;

    public String getRelations() {
        return relations;
    }

    public void setRelations(String relations) {
        this.relations = relations;
    }

    private Short level;

    private String mobile;

    private String password;

    private String tradePassword;

    private String name;

    private String email;

    private BigDecimal money;

    private BigDecimal expectedMoney;

    private BigDecimal fetchingMoney;

    private BigDecimal frozenMoney;

    private BigDecimal score;

    private BigDecimal fetchingScore;

    private BigDecimal sumScore;

    private BigDecimal coupon;

    private Integer wheelTimes;

    private Integer exp;

    private Integer curExp;

    private String openid;

    private String nickname;

    private String sex;

    private String language;

    private String headimgurl;

    private Boolean subscribe;

    private Integer subscribeTime;

    private Integer lastProfitTime;

    private String remark;

    private Boolean status;

    private Integer ctime;

    private Integer cctime;

    private Integer sign;

    private Integer signtime;

    private Boolean isfx;

    private Boolean isfxgd;

    private Float totalBuy;

    private Float totalYj;

    private Float totalXxyj;

    private Integer totalXxlink;

    private Integer totalXxsub;

    private Integer totalXxunsub;

    private Integer totalXxbuy;

    private Boolean employee;

    private Boolean isProfited;

    private Boolean changeRmember;

    private Integer recommededAt;

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

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getExpectedMoney() {
        return expectedMoney;
    }

    public void setExpectedMoney(BigDecimal expectedMoney) {
        this.expectedMoney = expectedMoney;
    }

    public BigDecimal getFetchingMoney() {
        return fetchingMoney;
    }

    public void setFetchingMoney(BigDecimal fetchingMoney) {
        this.fetchingMoney = fetchingMoney;
    }

    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getFetchingScore() {
        return fetchingScore;
    }

    public void setFetchingScore(BigDecimal fetchingScore) {
        this.fetchingScore = fetchingScore;
    }

    public BigDecimal getSumScore() {
        return sumScore;
    }

    public void setSumScore(BigDecimal sumScore) {
        this.sumScore = sumScore;
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    public Integer getWheelTimes() {
        return wheelTimes;
    }

    public void setWheelTimes(Integer wheelTimes) {
        this.wheelTimes = wheelTimes;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getCurExp() {
        return curExp;
    }

    public void setCurExp(Integer curExp) {
        this.curExp = curExp;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    public Boolean getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    public Integer getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Integer subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public Integer getLastProfitTime() {
        return lastProfitTime;
    }

    public void setLastProfitTime(Integer lastProfitTime) {
        this.lastProfitTime = lastProfitTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public Integer getCctime() {
        return cctime;
    }

    public void setCctime(Integer cctime) {
        this.cctime = cctime;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Integer getSigntime() {
        return signtime;
    }

    public void setSigntime(Integer signtime) {
        this.signtime = signtime;
    }

    public Boolean getIsfx() {
        return isfx;
    }

    public void setIsfx(Boolean isfx) {
        this.isfx = isfx;
    }

    public Boolean getIsfxgd() {
        return isfxgd;
    }

    public void setIsfxgd(Boolean isfxgd) {
        this.isfxgd = isfxgd;
    }

    public Float getTotalBuy() {
        return totalBuy;
    }

    public void setTotalBuy(Float totalBuy) {
        this.totalBuy = totalBuy;
    }

    public Float getTotalYj() {
        return totalYj;
    }

    public void setTotalYj(Float totalYj) {
        this.totalYj = totalYj;
    }

    public Float getTotalXxyj() {
        return totalXxyj;
    }

    public void setTotalXxyj(Float totalXxyj) {
        this.totalXxyj = totalXxyj;
    }

    public Integer getTotalXxlink() {
        return totalXxlink;
    }

    public void setTotalXxlink(Integer totalXxlink) {
        this.totalXxlink = totalXxlink;
    }

    public Integer getTotalXxsub() {
        return totalXxsub;
    }

    public void setTotalXxsub(Integer totalXxsub) {
        this.totalXxsub = totalXxsub;
    }

    public Integer getTotalXxunsub() {
        return totalXxunsub;
    }

    public void setTotalXxunsub(Integer totalXxunsub) {
        this.totalXxunsub = totalXxunsub;
    }

    public Integer getTotalXxbuy() {
        return totalXxbuy;
    }

    public void setTotalXxbuy(Integer totalXxbuy) {
        this.totalXxbuy = totalXxbuy;
    }

    public Boolean getEmployee() {
        return employee;
    }

    public void setEmployee(Boolean employee) {
        this.employee = employee;
    }

    public Boolean getIsProfited() {
        return isProfited;
    }

    public void setIsProfited(Boolean isProfited) {
        this.isProfited = isProfited;
    }

    public Boolean getChangeRmember() {
        return changeRmember;
    }

    public void setChangeRmember(Boolean changeRmember) {
        this.changeRmember = changeRmember;
    }

    public Integer getRecommededAt() {
        return recommededAt;
    }

    public void setRecommededAt(Integer recommededAt) {
        this.recommededAt = recommededAt;
    }
}