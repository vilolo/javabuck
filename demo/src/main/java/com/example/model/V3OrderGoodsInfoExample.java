package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V3OrderGoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V3OrderGoodsInfoExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andMemberLevelIsNull() {
            addCriterion("member_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(Byte value) {
            addCriterion("member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(Byte value) {
            addCriterion("member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(Byte value) {
            addCriterion("member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(Byte value) {
            addCriterion("member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(Byte value) {
            addCriterion("member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<Byte> values) {
            addCriterion("member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<Byte> values) {
            addCriterion("member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(Byte value1, Byte value2) {
            addCriterion("member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("member_level not between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdIsNull() {
            addCriterion("agent_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdIsNotNull() {
            addCriterion("agent_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdEqualTo(Integer value) {
            addCriterion("agent_goods_id =", value, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdNotEqualTo(Integer value) {
            addCriterion("agent_goods_id <>", value, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdGreaterThan(Integer value) {
            addCriterion("agent_goods_id >", value, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_goods_id >=", value, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdLessThan(Integer value) {
            addCriterion("agent_goods_id <", value, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_goods_id <=", value, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdIn(List<Integer> values) {
            addCriterion("agent_goods_id in", values, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdNotIn(List<Integer> values) {
            addCriterion("agent_goods_id not in", values, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_goods_id between", value1, value2, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_goods_id not between", value1, value2, "agentGoodsId");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberIsNull() {
            addCriterion("agent_goods_number is null");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberIsNotNull() {
            addCriterion("agent_goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberEqualTo(Integer value) {
            addCriterion("agent_goods_number =", value, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberNotEqualTo(Integer value) {
            addCriterion("agent_goods_number <>", value, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberGreaterThan(Integer value) {
            addCriterion("agent_goods_number >", value, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_goods_number >=", value, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberLessThan(Integer value) {
            addCriterion("agent_goods_number <", value, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("agent_goods_number <=", value, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberIn(List<Integer> values) {
            addCriterion("agent_goods_number in", values, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberNotIn(List<Integer> values) {
            addCriterion("agent_goods_number not in", values, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("agent_goods_number between", value1, value2, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_goods_number not between", value1, value2, "agentGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelIsNull() {
            addCriterion("goods_level is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelIsNotNull() {
            addCriterion("goods_level is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelEqualTo(Boolean value) {
            addCriterion("goods_level =", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelNotEqualTo(Boolean value) {
            addCriterion("goods_level <>", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelGreaterThan(Boolean value) {
            addCriterion("goods_level >", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("goods_level >=", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelLessThan(Boolean value) {
            addCriterion("goods_level <", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("goods_level <=", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelIn(List<Boolean> values) {
            addCriterion("goods_level in", values, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelNotIn(List<Boolean> values) {
            addCriterion("goods_level not in", values, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_level between", value1, value2, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_level not between", value1, value2, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateIsNull() {
            addCriterion("goods_profit_rate is null");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateIsNotNull() {
            addCriterion("goods_profit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateEqualTo(BigDecimal value) {
            addCriterion("goods_profit_rate =", value, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateNotEqualTo(BigDecimal value) {
            addCriterion("goods_profit_rate <>", value, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateGreaterThan(BigDecimal value) {
            addCriterion("goods_profit_rate >", value, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_profit_rate >=", value, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateLessThan(BigDecimal value) {
            addCriterion("goods_profit_rate <", value, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_profit_rate <=", value, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateIn(List<BigDecimal> values) {
            addCriterion("goods_profit_rate in", values, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateNotIn(List<BigDecimal> values) {
            addCriterion("goods_profit_rate not in", values, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_profit_rate between", value1, value2, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andGoodsProfitRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_profit_rate not between", value1, value2, "goodsProfitRate");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNull() {
            addCriterion("sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNotNull() {
            addCriterion("sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCountEqualTo(Integer value) {
            addCriterion("sale_count =", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotEqualTo(Integer value) {
            addCriterion("sale_count <>", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThan(Integer value) {
            addCriterion("sale_count >", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_count >=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThan(Integer value) {
            addCriterion("sale_count <", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_count <=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountIn(List<Integer> values) {
            addCriterion("sale_count in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotIn(List<Integer> values) {
            addCriterion("sale_count not in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_count between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_count not between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(BigDecimal value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
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