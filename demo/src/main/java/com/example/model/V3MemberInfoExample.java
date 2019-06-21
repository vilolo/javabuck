package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V3MemberInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V3MemberInfoExample() {
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

        public Criteria andRMemberIdIsNull() {
            addCriterion("r_member_id is null");
            return (Criteria) this;
        }

        public Criteria andRMemberIdIsNotNull() {
            addCriterion("r_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andRMemberIdEqualTo(Integer value) {
            addCriterion("r_member_id =", value, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdNotEqualTo(Integer value) {
            addCriterion("r_member_id <>", value, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdGreaterThan(Integer value) {
            addCriterion("r_member_id >", value, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_member_id >=", value, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdLessThan(Integer value) {
            addCriterion("r_member_id <", value, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_member_id <=", value, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdIn(List<Integer> values) {
            addCriterion("r_member_id in", values, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdNotIn(List<Integer> values) {
            addCriterion("r_member_id not in", values, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("r_member_id between", value1, value2, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andRMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_member_id not between", value1, value2, "rMemberId");
            return (Criteria) this;
        }

        public Criteria andLayerIsNull() {
            addCriterion("layer is null");
            return (Criteria) this;
        }

        public Criteria andLayerIsNotNull() {
            addCriterion("layer is not null");
            return (Criteria) this;
        }

        public Criteria andLayerEqualTo(Integer value) {
            addCriterion("layer =", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotEqualTo(Integer value) {
            addCriterion("layer <>", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThan(Integer value) {
            addCriterion("layer >", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("layer >=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThan(Integer value) {
            addCriterion("layer <", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThanOrEqualTo(Integer value) {
            addCriterion("layer <=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerIn(List<Integer> values) {
            addCriterion("layer in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotIn(List<Integer> values) {
            addCriterion("layer not in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerBetween(Integer value1, Integer value2) {
            addCriterion("layer between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("layer not between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIsNull() {
            addCriterion("trade_password is null");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIsNotNull() {
            addCriterion("trade_password is not null");
            return (Criteria) this;
        }

        public Criteria andTradePasswordEqualTo(String value) {
            addCriterion("trade_password =", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotEqualTo(String value) {
            addCriterion("trade_password <>", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordGreaterThan(String value) {
            addCriterion("trade_password >", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("trade_password >=", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLessThan(String value) {
            addCriterion("trade_password <", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLessThanOrEqualTo(String value) {
            addCriterion("trade_password <=", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLike(String value) {
            addCriterion("trade_password like", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotLike(String value) {
            addCriterion("trade_password not like", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIn(List<String> values) {
            addCriterion("trade_password in", values, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotIn(List<String> values) {
            addCriterion("trade_password not in", values, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordBetween(String value1, String value2) {
            addCriterion("trade_password between", value1, value2, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotBetween(String value1, String value2) {
            addCriterion("trade_password not between", value1, value2, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNull() {
            addCriterion("true_name is null");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNotNull() {
            addCriterion("true_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("true_name =", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("true_name <>", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("true_name >", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("true_name >=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThan(String value) {
            addCriterion("true_name <", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("true_name <=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLike(String value) {
            addCriterion("true_name like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotLike(String value) {
            addCriterion("true_name not like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("true_name in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("true_name not in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("true_name between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("true_name not between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andHeadImgIsNull() {
            addCriterion("head_img is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgIsNotNull() {
            addCriterion("head_img is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgEqualTo(String value) {
            addCriterion("head_img =", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotEqualTo(String value) {
            addCriterion("head_img <>", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgGreaterThan(String value) {
            addCriterion("head_img >", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("head_img >=", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLessThan(String value) {
            addCriterion("head_img <", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLessThanOrEqualTo(String value) {
            addCriterion("head_img <=", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLike(String value) {
            addCriterion("head_img like", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotLike(String value) {
            addCriterion("head_img not like", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgIn(List<String> values) {
            addCriterion("head_img in", values, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotIn(List<String> values) {
            addCriterion("head_img not in", values, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgBetween(String value1, String value2) {
            addCriterion("head_img between", value1, value2, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotBetween(String value1, String value2) {
            addCriterion("head_img not between", value1, value2, "headImg");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberIsNull() {
            addCriterion("can_change_remember is null");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberIsNotNull() {
            addCriterion("can_change_remember is not null");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberEqualTo(Boolean value) {
            addCriterion("can_change_remember =", value, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberNotEqualTo(Boolean value) {
            addCriterion("can_change_remember <>", value, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberGreaterThan(Boolean value) {
            addCriterion("can_change_remember >", value, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberGreaterThanOrEqualTo(Boolean value) {
            addCriterion("can_change_remember >=", value, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberLessThan(Boolean value) {
            addCriterion("can_change_remember <", value, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberLessThanOrEqualTo(Boolean value) {
            addCriterion("can_change_remember <=", value, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberIn(List<Boolean> values) {
            addCriterion("can_change_remember in", values, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberNotIn(List<Boolean> values) {
            addCriterion("can_change_remember not in", values, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberBetween(Boolean value1, Boolean value2) {
            addCriterion("can_change_remember between", value1, value2, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andCanChangeRememberNotBetween(Boolean value1, Boolean value2) {
            addCriterion("can_change_remember not between", value1, value2, "canChangeRemember");
            return (Criteria) this;
        }

        public Criteria andPosterUrlIsNull() {
            addCriterion("poster_url is null");
            return (Criteria) this;
        }

        public Criteria andPosterUrlIsNotNull() {
            addCriterion("poster_url is not null");
            return (Criteria) this;
        }

        public Criteria andPosterUrlEqualTo(String value) {
            addCriterion("poster_url =", value, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlNotEqualTo(String value) {
            addCriterion("poster_url <>", value, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlGreaterThan(String value) {
            addCriterion("poster_url >", value, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlGreaterThanOrEqualTo(String value) {
            addCriterion("poster_url >=", value, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlLessThan(String value) {
            addCriterion("poster_url <", value, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlLessThanOrEqualTo(String value) {
            addCriterion("poster_url <=", value, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlLike(String value) {
            addCriterion("poster_url like", value, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlNotLike(String value) {
            addCriterion("poster_url not like", value, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlIn(List<String> values) {
            addCriterion("poster_url in", values, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlNotIn(List<String> values) {
            addCriterion("poster_url not in", values, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlBetween(String value1, String value2) {
            addCriterion("poster_url between", value1, value2, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andPosterUrlNotBetween(String value1, String value2) {
            addCriterion("poster_url not between", value1, value2, "posterUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdIsNull() {
            addCriterion("sp_member_id is null");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdIsNotNull() {
            addCriterion("sp_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdEqualTo(Integer value) {
            addCriterion("sp_member_id =", value, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdNotEqualTo(Integer value) {
            addCriterion("sp_member_id <>", value, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdGreaterThan(Integer value) {
            addCriterion("sp_member_id >", value, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_member_id >=", value, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdLessThan(Integer value) {
            addCriterion("sp_member_id <", value, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("sp_member_id <=", value, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdIn(List<Integer> values) {
            addCriterion("sp_member_id in", values, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdNotIn(List<Integer> values) {
            addCriterion("sp_member_id not in", values, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("sp_member_id between", value1, value2, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andSpMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_member_id not between", value1, value2, "spMemberId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtIsNull() {
            addCriterion("recommeded_at is null");
            return (Criteria) this;
        }

        public Criteria andRecommededAtIsNotNull() {
            addCriterion("recommeded_at is not null");
            return (Criteria) this;
        }

        public Criteria andRecommededAtEqualTo(Date value) {
            addCriterion("recommeded_at =", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtNotEqualTo(Date value) {
            addCriterion("recommeded_at <>", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtGreaterThan(Date value) {
            addCriterion("recommeded_at >", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtGreaterThanOrEqualTo(Date value) {
            addCriterion("recommeded_at >=", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtLessThan(Date value) {
            addCriterion("recommeded_at <", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtLessThanOrEqualTo(Date value) {
            addCriterion("recommeded_at <=", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtIn(List<Date> values) {
            addCriterion("recommeded_at in", values, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtNotIn(List<Date> values) {
            addCriterion("recommeded_at not in", values, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtBetween(Date value1, Date value2) {
            addCriterion("recommeded_at between", value1, value2, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtNotBetween(Date value1, Date value2) {
            addCriterion("recommeded_at not between", value1, value2, "recommededAt");
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