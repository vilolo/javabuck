package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Short value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Short value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Short value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Short value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Short value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Short> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Short> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Short value1, Short value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Short value1, Short value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyIsNull() {
            addCriterion("expected_money is null");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyIsNotNull() {
            addCriterion("expected_money is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyEqualTo(BigDecimal value) {
            addCriterion("expected_money =", value, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyNotEqualTo(BigDecimal value) {
            addCriterion("expected_money <>", value, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyGreaterThan(BigDecimal value) {
            addCriterion("expected_money >", value, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expected_money >=", value, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyLessThan(BigDecimal value) {
            addCriterion("expected_money <", value, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expected_money <=", value, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyIn(List<BigDecimal> values) {
            addCriterion("expected_money in", values, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyNotIn(List<BigDecimal> values) {
            addCriterion("expected_money not in", values, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expected_money between", value1, value2, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andExpectedMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expected_money not between", value1, value2, "expectedMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyIsNull() {
            addCriterion("fetching_money is null");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyIsNotNull() {
            addCriterion("fetching_money is not null");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyEqualTo(BigDecimal value) {
            addCriterion("fetching_money =", value, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("fetching_money <>", value, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyGreaterThan(BigDecimal value) {
            addCriterion("fetching_money >", value, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fetching_money >=", value, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyLessThan(BigDecimal value) {
            addCriterion("fetching_money <", value, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fetching_money <=", value, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyIn(List<BigDecimal> values) {
            addCriterion("fetching_money in", values, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("fetching_money not in", values, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fetching_money between", value1, value2, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFetchingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fetching_money not between", value1, value2, "fetchingMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIsNull() {
            addCriterion("frozen_money is null");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIsNotNull() {
            addCriterion("frozen_money is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyEqualTo(BigDecimal value) {
            addCriterion("frozen_money =", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotEqualTo(BigDecimal value) {
            addCriterion("frozen_money <>", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyGreaterThan(BigDecimal value) {
            addCriterion("frozen_money >", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_money >=", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyLessThan(BigDecimal value) {
            addCriterion("frozen_money <", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_money <=", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIn(List<BigDecimal> values) {
            addCriterion("frozen_money in", values, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotIn(List<BigDecimal> values) {
            addCriterion("frozen_money not in", values, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_money between", value1, value2, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_money not between", value1, value2, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreIsNull() {
            addCriterion("fetching_score is null");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreIsNotNull() {
            addCriterion("fetching_score is not null");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreEqualTo(BigDecimal value) {
            addCriterion("fetching_score =", value, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreNotEqualTo(BigDecimal value) {
            addCriterion("fetching_score <>", value, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreGreaterThan(BigDecimal value) {
            addCriterion("fetching_score >", value, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fetching_score >=", value, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreLessThan(BigDecimal value) {
            addCriterion("fetching_score <", value, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fetching_score <=", value, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreIn(List<BigDecimal> values) {
            addCriterion("fetching_score in", values, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreNotIn(List<BigDecimal> values) {
            addCriterion("fetching_score not in", values, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fetching_score between", value1, value2, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andFetchingScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fetching_score not between", value1, value2, "fetchingScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreIsNull() {
            addCriterion("sum_score is null");
            return (Criteria) this;
        }

        public Criteria andSumScoreIsNotNull() {
            addCriterion("sum_score is not null");
            return (Criteria) this;
        }

        public Criteria andSumScoreEqualTo(BigDecimal value) {
            addCriterion("sum_score =", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotEqualTo(BigDecimal value) {
            addCriterion("sum_score <>", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreGreaterThan(BigDecimal value) {
            addCriterion("sum_score >", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_score >=", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreLessThan(BigDecimal value) {
            addCriterion("sum_score <", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_score <=", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreIn(List<BigDecimal> values) {
            addCriterion("sum_score in", values, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotIn(List<BigDecimal> values) {
            addCriterion("sum_score not in", values, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_score between", value1, value2, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_score not between", value1, value2, "sumScore");
            return (Criteria) this;
        }

        public Criteria andCouponIsNull() {
            addCriterion("coupon is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsNotNull() {
            addCriterion("coupon is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEqualTo(BigDecimal value) {
            addCriterion("coupon =", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotEqualTo(BigDecimal value) {
            addCriterion("coupon <>", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThan(BigDecimal value) {
            addCriterion("coupon >", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon >=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThan(BigDecimal value) {
            addCriterion("coupon <", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon <=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponIn(List<BigDecimal> values) {
            addCriterion("coupon in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotIn(List<BigDecimal> values) {
            addCriterion("coupon not in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon not between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andWheelTimesIsNull() {
            addCriterion("wheel_times is null");
            return (Criteria) this;
        }

        public Criteria andWheelTimesIsNotNull() {
            addCriterion("wheel_times is not null");
            return (Criteria) this;
        }

        public Criteria andWheelTimesEqualTo(Integer value) {
            addCriterion("wheel_times =", value, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesNotEqualTo(Integer value) {
            addCriterion("wheel_times <>", value, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesGreaterThan(Integer value) {
            addCriterion("wheel_times >", value, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("wheel_times >=", value, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesLessThan(Integer value) {
            addCriterion("wheel_times <", value, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesLessThanOrEqualTo(Integer value) {
            addCriterion("wheel_times <=", value, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesIn(List<Integer> values) {
            addCriterion("wheel_times in", values, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesNotIn(List<Integer> values) {
            addCriterion("wheel_times not in", values, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesBetween(Integer value1, Integer value2) {
            addCriterion("wheel_times between", value1, value2, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andWheelTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("wheel_times not between", value1, value2, "wheelTimes");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(Integer value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(Integer value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(Integer value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(Integer value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(Integer value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<Integer> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<Integer> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(Integer value1, Integer value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(Integer value1, Integer value2) {
            addCriterion("exp not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andCurExpIsNull() {
            addCriterion("cur_exp is null");
            return (Criteria) this;
        }

        public Criteria andCurExpIsNotNull() {
            addCriterion("cur_exp is not null");
            return (Criteria) this;
        }

        public Criteria andCurExpEqualTo(Integer value) {
            addCriterion("cur_exp =", value, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpNotEqualTo(Integer value) {
            addCriterion("cur_exp <>", value, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpGreaterThan(Integer value) {
            addCriterion("cur_exp >", value, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_exp >=", value, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpLessThan(Integer value) {
            addCriterion("cur_exp <", value, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpLessThanOrEqualTo(Integer value) {
            addCriterion("cur_exp <=", value, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpIn(List<Integer> values) {
            addCriterion("cur_exp in", values, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpNotIn(List<Integer> values) {
            addCriterion("cur_exp not in", values, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpBetween(Integer value1, Integer value2) {
            addCriterion("cur_exp between", value1, value2, "curExp");
            return (Criteria) this;
        }

        public Criteria andCurExpNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_exp not between", value1, value2, "curExp");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNull() {
            addCriterion("headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNotNull() {
            addCriterion("headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlEqualTo(String value) {
            addCriterion("headimgurl =", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotEqualTo(String value) {
            addCriterion("headimgurl <>", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThan(String value) {
            addCriterion("headimgurl >", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("headimgurl >=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThan(String value) {
            addCriterion("headimgurl <", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("headimgurl <=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLike(String value) {
            addCriterion("headimgurl like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotLike(String value) {
            addCriterion("headimgurl not like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIn(List<String> values) {
            addCriterion("headimgurl in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotIn(List<String> values) {
            addCriterion("headimgurl not in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlBetween(String value1, String value2) {
            addCriterion("headimgurl between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("headimgurl not between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andSubscribeIsNull() {
            addCriterion("subscribe is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeIsNotNull() {
            addCriterion("subscribe is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeEqualTo(Boolean value) {
            addCriterion("subscribe =", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotEqualTo(Boolean value) {
            addCriterion("subscribe <>", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeGreaterThan(Boolean value) {
            addCriterion("subscribe >", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subscribe >=", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLessThan(Boolean value) {
            addCriterion("subscribe <", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLessThanOrEqualTo(Boolean value) {
            addCriterion("subscribe <=", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeIn(List<Boolean> values) {
            addCriterion("subscribe in", values, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotIn(List<Boolean> values) {
            addCriterion("subscribe not in", values, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeBetween(Boolean value1, Boolean value2) {
            addCriterion("subscribe between", value1, value2, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subscribe not between", value1, value2, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNull() {
            addCriterion("subscribe_time is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNotNull() {
            addCriterion("subscribe_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeEqualTo(Integer value) {
            addCriterion("subscribe_time =", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotEqualTo(Integer value) {
            addCriterion("subscribe_time <>", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThan(Integer value) {
            addCriterion("subscribe_time >", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("subscribe_time >=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThan(Integer value) {
            addCriterion("subscribe_time <", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("subscribe_time <=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIn(List<Integer> values) {
            addCriterion("subscribe_time in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotIn(List<Integer> values) {
            addCriterion("subscribe_time not in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeBetween(Integer value1, Integer value2) {
            addCriterion("subscribe_time between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("subscribe_time not between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeIsNull() {
            addCriterion("last_profit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeIsNotNull() {
            addCriterion("last_profit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeEqualTo(Integer value) {
            addCriterion("last_profit_time =", value, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeNotEqualTo(Integer value) {
            addCriterion("last_profit_time <>", value, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeGreaterThan(Integer value) {
            addCriterion("last_profit_time >", value, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_profit_time >=", value, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeLessThan(Integer value) {
            addCriterion("last_profit_time <", value, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_profit_time <=", value, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeIn(List<Integer> values) {
            addCriterion("last_profit_time in", values, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeNotIn(List<Integer> values) {
            addCriterion("last_profit_time not in", values, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_profit_time between", value1, value2, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andLastProfitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_profit_time not between", value1, value2, "lastProfitTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Integer value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Integer value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Integer value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Integer value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Integer> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Integer> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Integer value1, Integer value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCctimeIsNull() {
            addCriterion("cctime is null");
            return (Criteria) this;
        }

        public Criteria andCctimeIsNotNull() {
            addCriterion("cctime is not null");
            return (Criteria) this;
        }

        public Criteria andCctimeEqualTo(Integer value) {
            addCriterion("cctime =", value, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeNotEqualTo(Integer value) {
            addCriterion("cctime <>", value, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeGreaterThan(Integer value) {
            addCriterion("cctime >", value, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cctime >=", value, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeLessThan(Integer value) {
            addCriterion("cctime <", value, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeLessThanOrEqualTo(Integer value) {
            addCriterion("cctime <=", value, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeIn(List<Integer> values) {
            addCriterion("cctime in", values, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeNotIn(List<Integer> values) {
            addCriterion("cctime not in", values, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeBetween(Integer value1, Integer value2) {
            addCriterion("cctime between", value1, value2, "cctime");
            return (Criteria) this;
        }

        public Criteria andCctimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cctime not between", value1, value2, "cctime");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(Integer value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(Integer value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(Integer value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(Integer value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(Integer value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<Integer> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<Integer> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(Integer value1, Integer value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(Integer value1, Integer value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("signtime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("signtime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Integer value) {
            addCriterion("signtime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Integer value) {
            addCriterion("signtime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Integer value) {
            addCriterion("signtime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("signtime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Integer value) {
            addCriterion("signtime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Integer value) {
            addCriterion("signtime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Integer> values) {
            addCriterion("signtime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Integer> values) {
            addCriterion("signtime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Integer value1, Integer value2) {
            addCriterion("signtime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("signtime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andIsfxIsNull() {
            addCriterion("isfx is null");
            return (Criteria) this;
        }

        public Criteria andIsfxIsNotNull() {
            addCriterion("isfx is not null");
            return (Criteria) this;
        }

        public Criteria andIsfxEqualTo(Boolean value) {
            addCriterion("isfx =", value, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxNotEqualTo(Boolean value) {
            addCriterion("isfx <>", value, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxGreaterThan(Boolean value) {
            addCriterion("isfx >", value, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isfx >=", value, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxLessThan(Boolean value) {
            addCriterion("isfx <", value, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxLessThanOrEqualTo(Boolean value) {
            addCriterion("isfx <=", value, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxIn(List<Boolean> values) {
            addCriterion("isfx in", values, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxNotIn(List<Boolean> values) {
            addCriterion("isfx not in", values, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxBetween(Boolean value1, Boolean value2) {
            addCriterion("isfx between", value1, value2, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isfx not between", value1, value2, "isfx");
            return (Criteria) this;
        }

        public Criteria andIsfxgdIsNull() {
            addCriterion("isfxgd is null");
            return (Criteria) this;
        }

        public Criteria andIsfxgdIsNotNull() {
            addCriterion("isfxgd is not null");
            return (Criteria) this;
        }

        public Criteria andIsfxgdEqualTo(Boolean value) {
            addCriterion("isfxgd =", value, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdNotEqualTo(Boolean value) {
            addCriterion("isfxgd <>", value, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdGreaterThan(Boolean value) {
            addCriterion("isfxgd >", value, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isfxgd >=", value, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdLessThan(Boolean value) {
            addCriterion("isfxgd <", value, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdLessThanOrEqualTo(Boolean value) {
            addCriterion("isfxgd <=", value, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdIn(List<Boolean> values) {
            addCriterion("isfxgd in", values, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdNotIn(List<Boolean> values) {
            addCriterion("isfxgd not in", values, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdBetween(Boolean value1, Boolean value2) {
            addCriterion("isfxgd between", value1, value2, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andIsfxgdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isfxgd not between", value1, value2, "isfxgd");
            return (Criteria) this;
        }

        public Criteria andTotalBuyIsNull() {
            addCriterion("total_buy is null");
            return (Criteria) this;
        }

        public Criteria andTotalBuyIsNotNull() {
            addCriterion("total_buy is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBuyEqualTo(Float value) {
            addCriterion("total_buy =", value, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyNotEqualTo(Float value) {
            addCriterion("total_buy <>", value, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyGreaterThan(Float value) {
            addCriterion("total_buy >", value, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyGreaterThanOrEqualTo(Float value) {
            addCriterion("total_buy >=", value, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLessThan(Float value) {
            addCriterion("total_buy <", value, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLessThanOrEqualTo(Float value) {
            addCriterion("total_buy <=", value, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyIn(List<Float> values) {
            addCriterion("total_buy in", values, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyNotIn(List<Float> values) {
            addCriterion("total_buy not in", values, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyBetween(Float value1, Float value2) {
            addCriterion("total_buy between", value1, value2, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalBuyNotBetween(Float value1, Float value2) {
            addCriterion("total_buy not between", value1, value2, "totalBuy");
            return (Criteria) this;
        }

        public Criteria andTotalYjIsNull() {
            addCriterion("total_yj is null");
            return (Criteria) this;
        }

        public Criteria andTotalYjIsNotNull() {
            addCriterion("total_yj is not null");
            return (Criteria) this;
        }

        public Criteria andTotalYjEqualTo(Float value) {
            addCriterion("total_yj =", value, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjNotEqualTo(Float value) {
            addCriterion("total_yj <>", value, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjGreaterThan(Float value) {
            addCriterion("total_yj >", value, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjGreaterThanOrEqualTo(Float value) {
            addCriterion("total_yj >=", value, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjLessThan(Float value) {
            addCriterion("total_yj <", value, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjLessThanOrEqualTo(Float value) {
            addCriterion("total_yj <=", value, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjIn(List<Float> values) {
            addCriterion("total_yj in", values, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjNotIn(List<Float> values) {
            addCriterion("total_yj not in", values, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjBetween(Float value1, Float value2) {
            addCriterion("total_yj between", value1, value2, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalYjNotBetween(Float value1, Float value2) {
            addCriterion("total_yj not between", value1, value2, "totalYj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjIsNull() {
            addCriterion("total_xxyj is null");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjIsNotNull() {
            addCriterion("total_xxyj is not null");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjEqualTo(Float value) {
            addCriterion("total_xxyj =", value, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjNotEqualTo(Float value) {
            addCriterion("total_xxyj <>", value, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjGreaterThan(Float value) {
            addCriterion("total_xxyj >", value, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjGreaterThanOrEqualTo(Float value) {
            addCriterion("total_xxyj >=", value, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjLessThan(Float value) {
            addCriterion("total_xxyj <", value, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjLessThanOrEqualTo(Float value) {
            addCriterion("total_xxyj <=", value, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjIn(List<Float> values) {
            addCriterion("total_xxyj in", values, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjNotIn(List<Float> values) {
            addCriterion("total_xxyj not in", values, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjBetween(Float value1, Float value2) {
            addCriterion("total_xxyj between", value1, value2, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxyjNotBetween(Float value1, Float value2) {
            addCriterion("total_xxyj not between", value1, value2, "totalXxyj");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkIsNull() {
            addCriterion("total_xxlink is null");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkIsNotNull() {
            addCriterion("total_xxlink is not null");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkEqualTo(Integer value) {
            addCriterion("total_xxlink =", value, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkNotEqualTo(Integer value) {
            addCriterion("total_xxlink <>", value, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkGreaterThan(Integer value) {
            addCriterion("total_xxlink >", value, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_xxlink >=", value, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkLessThan(Integer value) {
            addCriterion("total_xxlink <", value, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkLessThanOrEqualTo(Integer value) {
            addCriterion("total_xxlink <=", value, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkIn(List<Integer> values) {
            addCriterion("total_xxlink in", values, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkNotIn(List<Integer> values) {
            addCriterion("total_xxlink not in", values, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkBetween(Integer value1, Integer value2) {
            addCriterion("total_xxlink between", value1, value2, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxlinkNotBetween(Integer value1, Integer value2) {
            addCriterion("total_xxlink not between", value1, value2, "totalXxlink");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubIsNull() {
            addCriterion("total_xxsub is null");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubIsNotNull() {
            addCriterion("total_xxsub is not null");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubEqualTo(Integer value) {
            addCriterion("total_xxsub =", value, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubNotEqualTo(Integer value) {
            addCriterion("total_xxsub <>", value, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubGreaterThan(Integer value) {
            addCriterion("total_xxsub >", value, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_xxsub >=", value, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubLessThan(Integer value) {
            addCriterion("total_xxsub <", value, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubLessThanOrEqualTo(Integer value) {
            addCriterion("total_xxsub <=", value, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubIn(List<Integer> values) {
            addCriterion("total_xxsub in", values, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubNotIn(List<Integer> values) {
            addCriterion("total_xxsub not in", values, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubBetween(Integer value1, Integer value2) {
            addCriterion("total_xxsub between", value1, value2, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxsubNotBetween(Integer value1, Integer value2) {
            addCriterion("total_xxsub not between", value1, value2, "totalXxsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubIsNull() {
            addCriterion("total_xxunsub is null");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubIsNotNull() {
            addCriterion("total_xxunsub is not null");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubEqualTo(Integer value) {
            addCriterion("total_xxunsub =", value, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubNotEqualTo(Integer value) {
            addCriterion("total_xxunsub <>", value, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubGreaterThan(Integer value) {
            addCriterion("total_xxunsub >", value, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_xxunsub >=", value, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubLessThan(Integer value) {
            addCriterion("total_xxunsub <", value, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubLessThanOrEqualTo(Integer value) {
            addCriterion("total_xxunsub <=", value, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubIn(List<Integer> values) {
            addCriterion("total_xxunsub in", values, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubNotIn(List<Integer> values) {
            addCriterion("total_xxunsub not in", values, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubBetween(Integer value1, Integer value2) {
            addCriterion("total_xxunsub between", value1, value2, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxunsubNotBetween(Integer value1, Integer value2) {
            addCriterion("total_xxunsub not between", value1, value2, "totalXxunsub");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyIsNull() {
            addCriterion("total_xxbuy is null");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyIsNotNull() {
            addCriterion("total_xxbuy is not null");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyEqualTo(Integer value) {
            addCriterion("total_xxbuy =", value, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyNotEqualTo(Integer value) {
            addCriterion("total_xxbuy <>", value, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyGreaterThan(Integer value) {
            addCriterion("total_xxbuy >", value, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_xxbuy >=", value, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyLessThan(Integer value) {
            addCriterion("total_xxbuy <", value, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyLessThanOrEqualTo(Integer value) {
            addCriterion("total_xxbuy <=", value, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyIn(List<Integer> values) {
            addCriterion("total_xxbuy in", values, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyNotIn(List<Integer> values) {
            addCriterion("total_xxbuy not in", values, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyBetween(Integer value1, Integer value2) {
            addCriterion("total_xxbuy between", value1, value2, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andTotalXxbuyNotBetween(Integer value1, Integer value2) {
            addCriterion("total_xxbuy not between", value1, value2, "totalXxbuy");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNull() {
            addCriterion("employee is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNotNull() {
            addCriterion("employee is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEqualTo(Boolean value) {
            addCriterion("employee =", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotEqualTo(Boolean value) {
            addCriterion("employee <>", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThan(Boolean value) {
            addCriterion("employee >", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("employee >=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThan(Boolean value) {
            addCriterion("employee <", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThanOrEqualTo(Boolean value) {
            addCriterion("employee <=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeIn(List<Boolean> values) {
            addCriterion("employee in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotIn(List<Boolean> values) {
            addCriterion("employee not in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeBetween(Boolean value1, Boolean value2) {
            addCriterion("employee between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("employee not between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andIsProfitedIsNull() {
            addCriterion("is_profited is null");
            return (Criteria) this;
        }

        public Criteria andIsProfitedIsNotNull() {
            addCriterion("is_profited is not null");
            return (Criteria) this;
        }

        public Criteria andIsProfitedEqualTo(Boolean value) {
            addCriterion("is_profited =", value, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedNotEqualTo(Boolean value) {
            addCriterion("is_profited <>", value, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedGreaterThan(Boolean value) {
            addCriterion("is_profited >", value, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_profited >=", value, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedLessThan(Boolean value) {
            addCriterion("is_profited <", value, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_profited <=", value, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedIn(List<Boolean> values) {
            addCriterion("is_profited in", values, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedNotIn(List<Boolean> values) {
            addCriterion("is_profited not in", values, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_profited between", value1, value2, "isProfited");
            return (Criteria) this;
        }

        public Criteria andIsProfitedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_profited not between", value1, value2, "isProfited");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberIsNull() {
            addCriterion("change_rmember is null");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberIsNotNull() {
            addCriterion("change_rmember is not null");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberEqualTo(Boolean value) {
            addCriterion("change_rmember =", value, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberNotEqualTo(Boolean value) {
            addCriterion("change_rmember <>", value, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberGreaterThan(Boolean value) {
            addCriterion("change_rmember >", value, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberGreaterThanOrEqualTo(Boolean value) {
            addCriterion("change_rmember >=", value, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberLessThan(Boolean value) {
            addCriterion("change_rmember <", value, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberLessThanOrEqualTo(Boolean value) {
            addCriterion("change_rmember <=", value, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberIn(List<Boolean> values) {
            addCriterion("change_rmember in", values, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberNotIn(List<Boolean> values) {
            addCriterion("change_rmember not in", values, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberBetween(Boolean value1, Boolean value2) {
            addCriterion("change_rmember between", value1, value2, "changeRmember");
            return (Criteria) this;
        }

        public Criteria andChangeRmemberNotBetween(Boolean value1, Boolean value2) {
            addCriterion("change_rmember not between", value1, value2, "changeRmember");
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

        public Criteria andRecommededAtEqualTo(Integer value) {
            addCriterion("recommeded_at =", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtNotEqualTo(Integer value) {
            addCriterion("recommeded_at <>", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtGreaterThan(Integer value) {
            addCriterion("recommeded_at >", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommeded_at >=", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtLessThan(Integer value) {
            addCriterion("recommeded_at <", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtLessThanOrEqualTo(Integer value) {
            addCriterion("recommeded_at <=", value, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtIn(List<Integer> values) {
            addCriterion("recommeded_at in", values, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtNotIn(List<Integer> values) {
            addCriterion("recommeded_at not in", values, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtBetween(Integer value1, Integer value2) {
            addCriterion("recommeded_at between", value1, value2, "recommededAt");
            return (Criteria) this;
        }

        public Criteria andRecommededAtNotBetween(Integer value1, Integer value2) {
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