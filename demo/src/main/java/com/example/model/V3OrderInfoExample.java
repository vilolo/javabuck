package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V3OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V3OrderInfoExample() {
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

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdIsNull() {
            addCriterion("shop_member_id is null");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdIsNotNull() {
            addCriterion("shop_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdEqualTo(Integer value) {
            addCriterion("shop_member_id =", value, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdNotEqualTo(Integer value) {
            addCriterion("shop_member_id <>", value, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdGreaterThan(Integer value) {
            addCriterion("shop_member_id >", value, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_member_id >=", value, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdLessThan(Integer value) {
            addCriterion("shop_member_id <", value, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_member_id <=", value, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdIn(List<Integer> values) {
            addCriterion("shop_member_id in", values, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdNotIn(List<Integer> values) {
            addCriterion("shop_member_id not in", values, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_member_id between", value1, value2, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_member_id not between", value1, value2, "shopMemberId");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNull() {
            addCriterion("shop_level is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNotNull() {
            addCriterion("shop_level is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelEqualTo(Integer value) {
            addCriterion("shop_level =", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotEqualTo(Integer value) {
            addCriterion("shop_level <>", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThan(Integer value) {
            addCriterion("shop_level >", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_level >=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThan(Integer value) {
            addCriterion("shop_level <", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThanOrEqualTo(Integer value) {
            addCriterion("shop_level <=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelIn(List<Integer> values) {
            addCriterion("shop_level in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotIn(List<Integer> values) {
            addCriterion("shop_level not in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelBetween(Integer value1, Integer value2) {
            addCriterion("shop_level between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_level not between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdIsNull() {
            addCriterion("pay_member_id is null");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdIsNotNull() {
            addCriterion("pay_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdEqualTo(Integer value) {
            addCriterion("pay_member_id =", value, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdNotEqualTo(Integer value) {
            addCriterion("pay_member_id <>", value, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdGreaterThan(Integer value) {
            addCriterion("pay_member_id >", value, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_member_id >=", value, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdLessThan(Integer value) {
            addCriterion("pay_member_id <", value, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_member_id <=", value, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdIn(List<Integer> values) {
            addCriterion("pay_member_id in", values, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdNotIn(List<Integer> values) {
            addCriterion("pay_member_id not in", values, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_member_id between", value1, value2, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_member_id not between", value1, value2, "payMemberId");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationIsNull() {
            addCriterion("pay_member_relation is null");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationIsNotNull() {
            addCriterion("pay_member_relation is not null");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationEqualTo(String value) {
            addCriterion("pay_member_relation =", value, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationNotEqualTo(String value) {
            addCriterion("pay_member_relation <>", value, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationGreaterThan(String value) {
            addCriterion("pay_member_relation >", value, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationGreaterThanOrEqualTo(String value) {
            addCriterion("pay_member_relation >=", value, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationLessThan(String value) {
            addCriterion("pay_member_relation <", value, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationLessThanOrEqualTo(String value) {
            addCriterion("pay_member_relation <=", value, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationLike(String value) {
            addCriterion("pay_member_relation like", value, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationNotLike(String value) {
            addCriterion("pay_member_relation not like", value, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationIn(List<String> values) {
            addCriterion("pay_member_relation in", values, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationNotIn(List<String> values) {
            addCriterion("pay_member_relation not in", values, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationBetween(String value1, String value2) {
            addCriterion("pay_member_relation between", value1, value2, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPayMemberRelationNotBetween(String value1, String value2) {
            addCriterion("pay_member_relation not between", value1, value2, "payMemberRelation");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("payment_amount =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("payment_amount <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("payment_amount >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_amount >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(BigDecimal value) {
            addCriterion("payment_amount <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_amount <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("payment_amount in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("payment_amount not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_amount between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_amount not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andProfitStatusIsNull() {
            addCriterion("profit_status is null");
            return (Criteria) this;
        }

        public Criteria andProfitStatusIsNotNull() {
            addCriterion("profit_status is not null");
            return (Criteria) this;
        }

        public Criteria andProfitStatusEqualTo(Boolean value) {
            addCriterion("profit_status =", value, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusNotEqualTo(Boolean value) {
            addCriterion("profit_status <>", value, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusGreaterThan(Boolean value) {
            addCriterion("profit_status >", value, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("profit_status >=", value, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusLessThan(Boolean value) {
            addCriterion("profit_status <", value, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("profit_status <=", value, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusIn(List<Boolean> values) {
            addCriterion("profit_status in", values, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusNotIn(List<Boolean> values) {
            addCriterion("profit_status not in", values, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("profit_status between", value1, value2, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("profit_status not between", value1, value2, "profitStatus");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkIsNull() {
            addCriterion("profit_remark is null");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkIsNotNull() {
            addCriterion("profit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkEqualTo(String value) {
            addCriterion("profit_remark =", value, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkNotEqualTo(String value) {
            addCriterion("profit_remark <>", value, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkGreaterThan(String value) {
            addCriterion("profit_remark >", value, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("profit_remark >=", value, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkLessThan(String value) {
            addCriterion("profit_remark <", value, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkLessThanOrEqualTo(String value) {
            addCriterion("profit_remark <=", value, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkLike(String value) {
            addCriterion("profit_remark like", value, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkNotLike(String value) {
            addCriterion("profit_remark not like", value, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkIn(List<String> values) {
            addCriterion("profit_remark in", values, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkNotIn(List<String> values) {
            addCriterion("profit_remark not in", values, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkBetween(String value1, String value2) {
            addCriterion("profit_remark between", value1, value2, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andProfitRemarkNotBetween(String value1, String value2) {
            addCriterion("profit_remark not between", value1, value2, "profitRemark");
            return (Criteria) this;
        }

        public Criteria andReceivedAtIsNull() {
            addCriterion("received_at is null");
            return (Criteria) this;
        }

        public Criteria andReceivedAtIsNotNull() {
            addCriterion("received_at is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedAtEqualTo(Integer value) {
            addCriterion("received_at =", value, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtNotEqualTo(Integer value) {
            addCriterion("received_at <>", value, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtGreaterThan(Integer value) {
            addCriterion("received_at >", value, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("received_at >=", value, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtLessThan(Integer value) {
            addCriterion("received_at <", value, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtLessThanOrEqualTo(Integer value) {
            addCriterion("received_at <=", value, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtIn(List<Integer> values) {
            addCriterion("received_at in", values, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtNotIn(List<Integer> values) {
            addCriterion("received_at not in", values, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtBetween(Integer value1, Integer value2) {
            addCriterion("received_at between", value1, value2, "receivedAt");
            return (Criteria) this;
        }

        public Criteria andReceivedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("received_at not between", value1, value2, "receivedAt");
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