package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysAuthInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysAuthInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNull() {
            addCriterion("wx_openid is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNotNull() {
            addCriterion("wx_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidEqualTo(String value) {
            addCriterion("wx_openid =", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotEqualTo(String value) {
            addCriterion("wx_openid <>", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThan(String value) {
            addCriterion("wx_openid >", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wx_openid >=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThan(String value) {
            addCriterion("wx_openid <", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThanOrEqualTo(String value) {
            addCriterion("wx_openid <=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLike(String value) {
            addCriterion("wx_openid like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotLike(String value) {
            addCriterion("wx_openid not like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIn(List<String> values) {
            addCriterion("wx_openid in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotIn(List<String> values) {
            addCriterion("wx_openid not in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidBetween(String value1, String value2) {
            addCriterion("wx_openid between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotBetween(String value1, String value2) {
            addCriterion("wx_openid not between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidIsNull() {
            addCriterion("wx_unionid is null");
            return (Criteria) this;
        }

        public Criteria andWxUnionidIsNotNull() {
            addCriterion("wx_unionid is not null");
            return (Criteria) this;
        }

        public Criteria andWxUnionidEqualTo(String value) {
            addCriterion("wx_unionid =", value, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidNotEqualTo(String value) {
            addCriterion("wx_unionid <>", value, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidGreaterThan(String value) {
            addCriterion("wx_unionid >", value, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("wx_unionid >=", value, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidLessThan(String value) {
            addCriterion("wx_unionid <", value, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidLessThanOrEqualTo(String value) {
            addCriterion("wx_unionid <=", value, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidLike(String value) {
            addCriterion("wx_unionid like", value, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidNotLike(String value) {
            addCriterion("wx_unionid not like", value, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidIn(List<String> values) {
            addCriterion("wx_unionid in", values, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidNotIn(List<String> values) {
            addCriterion("wx_unionid not in", values, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidBetween(String value1, String value2) {
            addCriterion("wx_unionid between", value1, value2, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxUnionidNotBetween(String value1, String value2) {
            addCriterion("wx_unionid not between", value1, value2, "wxUnionid");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenIsNull() {
            addCriterion("wx_refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenIsNotNull() {
            addCriterion("wx_refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenEqualTo(String value) {
            addCriterion("wx_refresh_token =", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenNotEqualTo(String value) {
            addCriterion("wx_refresh_token <>", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenGreaterThan(String value) {
            addCriterion("wx_refresh_token >", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("wx_refresh_token >=", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenLessThan(String value) {
            addCriterion("wx_refresh_token <", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("wx_refresh_token <=", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenLike(String value) {
            addCriterion("wx_refresh_token like", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenNotLike(String value) {
            addCriterion("wx_refresh_token not like", value, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenIn(List<String> values) {
            addCriterion("wx_refresh_token in", values, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenNotIn(List<String> values) {
            addCriterion("wx_refresh_token not in", values, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenBetween(String value1, String value2) {
            addCriterion("wx_refresh_token between", value1, value2, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWxRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("wx_refresh_token not between", value1, value2, "wxRefreshToken");
            return (Criteria) this;
        }

        public Criteria andWbUidIsNull() {
            addCriterion("wb_uid is null");
            return (Criteria) this;
        }

        public Criteria andWbUidIsNotNull() {
            addCriterion("wb_uid is not null");
            return (Criteria) this;
        }

        public Criteria andWbUidEqualTo(String value) {
            addCriterion("wb_uid =", value, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidNotEqualTo(String value) {
            addCriterion("wb_uid <>", value, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidGreaterThan(String value) {
            addCriterion("wb_uid >", value, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidGreaterThanOrEqualTo(String value) {
            addCriterion("wb_uid >=", value, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidLessThan(String value) {
            addCriterion("wb_uid <", value, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidLessThanOrEqualTo(String value) {
            addCriterion("wb_uid <=", value, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidLike(String value) {
            addCriterion("wb_uid like", value, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidNotLike(String value) {
            addCriterion("wb_uid not like", value, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidIn(List<String> values) {
            addCriterion("wb_uid in", values, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidNotIn(List<String> values) {
            addCriterion("wb_uid not in", values, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidBetween(String value1, String value2) {
            addCriterion("wb_uid between", value1, value2, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbUidNotBetween(String value1, String value2) {
            addCriterion("wb_uid not between", value1, value2, "wbUid");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenIsNull() {
            addCriterion("wb_access_token is null");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenIsNotNull() {
            addCriterion("wb_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenEqualTo(String value) {
            addCriterion("wb_access_token =", value, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenNotEqualTo(String value) {
            addCriterion("wb_access_token <>", value, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenGreaterThan(String value) {
            addCriterion("wb_access_token >", value, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("wb_access_token >=", value, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenLessThan(String value) {
            addCriterion("wb_access_token <", value, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("wb_access_token <=", value, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenLike(String value) {
            addCriterion("wb_access_token like", value, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenNotLike(String value) {
            addCriterion("wb_access_token not like", value, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenIn(List<String> values) {
            addCriterion("wb_access_token in", values, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenNotIn(List<String> values) {
            addCriterion("wb_access_token not in", values, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenBetween(String value1, String value2) {
            addCriterion("wb_access_token between", value1, value2, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andWbAccessTokenNotBetween(String value1, String value2) {
            addCriterion("wb_access_token not between", value1, value2, "wbAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(Byte value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(Byte value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(Byte value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(Byte value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(Byte value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<Byte> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<Byte> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(Byte value1, Byte value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Byte value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Byte value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Byte value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Byte value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Byte value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Byte> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Byte> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Byte value1, Byte value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Byte value1, Byte value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andTradingIdIsNull() {
            addCriterion("trading_id is null");
            return (Criteria) this;
        }

        public Criteria andTradingIdIsNotNull() {
            addCriterion("trading_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradingIdEqualTo(Integer value) {
            addCriterion("trading_id =", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotEqualTo(Integer value) {
            addCriterion("trading_id <>", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdGreaterThan(Integer value) {
            addCriterion("trading_id >", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trading_id >=", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdLessThan(Integer value) {
            addCriterion("trading_id <", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdLessThanOrEqualTo(Integer value) {
            addCriterion("trading_id <=", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdIn(List<Integer> values) {
            addCriterion("trading_id in", values, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotIn(List<Integer> values) {
            addCriterion("trading_id not in", values, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdBetween(Integer value1, Integer value2) {
            addCriterion("trading_id between", value1, value2, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trading_id not between", value1, value2, "tradingId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdIsNull() {
            addCriterion("plat_form_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdIsNotNull() {
            addCriterion("plat_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdEqualTo(Integer value) {
            addCriterion("plat_form_id =", value, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdNotEqualTo(Integer value) {
            addCriterion("plat_form_id <>", value, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdGreaterThan(Integer value) {
            addCriterion("plat_form_id >", value, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plat_form_id >=", value, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdLessThan(Integer value) {
            addCriterion("plat_form_id <", value, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("plat_form_id <=", value, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdIn(List<Integer> values) {
            addCriterion("plat_form_id in", values, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdNotIn(List<Integer> values) {
            addCriterion("plat_form_id not in", values, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdBetween(Integer value1, Integer value2) {
            addCriterion("plat_form_id between", value1, value2, "platFormId");
            return (Criteria) this;
        }

        public Criteria andPlatFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plat_form_id not between", value1, value2, "platFormId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}