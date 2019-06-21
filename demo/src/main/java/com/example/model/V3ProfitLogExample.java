package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V3ProfitLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V3ProfitLogExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
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

        public Criteria andMemberLevelEqualTo(Integer value) {
            addCriterion("member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(Integer value) {
            addCriterion("member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(Integer value) {
            addCriterion("member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(Integer value) {
            addCriterion("member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(Integer value) {
            addCriterion("member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<Integer> values) {
            addCriterion("member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<Integer> values) {
            addCriterion("member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(Integer value1, Integer value2) {
            addCriterion("member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level not between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIsNull() {
            addCriterion("area_ids is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIsNotNull() {
            addCriterion("area_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdsEqualTo(String value) {
            addCriterion("area_ids =", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotEqualTo(String value) {
            addCriterion("area_ids <>", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsGreaterThan(String value) {
            addCriterion("area_ids >", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsGreaterThanOrEqualTo(String value) {
            addCriterion("area_ids >=", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLessThan(String value) {
            addCriterion("area_ids <", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLessThanOrEqualTo(String value) {
            addCriterion("area_ids <=", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLike(String value) {
            addCriterion("area_ids like", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotLike(String value) {
            addCriterion("area_ids not like", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIn(List<String> values) {
            addCriterion("area_ids in", values, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotIn(List<String> values) {
            addCriterion("area_ids not in", values, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsBetween(String value1, String value2) {
            addCriterion("area_ids between", value1, value2, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotBetween(String value1, String value2) {
            addCriterion("area_ids not between", value1, value2, "areaIds");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNull() {
            addCriterion("profit_type is null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNotNull() {
            addCriterion("profit_type is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeEqualTo(Integer value) {
            addCriterion("profit_type =", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotEqualTo(Integer value) {
            addCriterion("profit_type <>", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThan(Integer value) {
            addCriterion("profit_type >", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("profit_type >=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThan(Integer value) {
            addCriterion("profit_type <", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("profit_type <=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIn(List<Integer> values) {
            addCriterion("profit_type in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotIn(List<Integer> values) {
            addCriterion("profit_type not in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeBetween(Integer value1, Integer value2) {
            addCriterion("profit_type between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("profit_type not between", value1, value2, "profitType");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIsNull() {
            addCriterion("assets_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIsNotNull() {
            addCriterion("assets_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeEqualTo(Integer value) {
            addCriterion("assets_type =", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotEqualTo(Integer value) {
            addCriterion("assets_type <>", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeGreaterThan(Integer value) {
            addCriterion("assets_type >", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("assets_type >=", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeLessThan(Integer value) {
            addCriterion("assets_type <", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("assets_type <=", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIn(List<Integer> values) {
            addCriterion("assets_type in", values, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotIn(List<Integer> values) {
            addCriterion("assets_type not in", values, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeBetween(Integer value1, Integer value2) {
            addCriterion("assets_type between", value1, value2, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("assets_type not between", value1, value2, "assetsType");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdIsNull() {
            addCriterion("from_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdIsNotNull() {
            addCriterion("from_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdEqualTo(Integer value) {
            addCriterion("from_goods_id =", value, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdNotEqualTo(Integer value) {
            addCriterion("from_goods_id <>", value, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdGreaterThan(Integer value) {
            addCriterion("from_goods_id >", value, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_goods_id >=", value, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdLessThan(Integer value) {
            addCriterion("from_goods_id <", value, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_goods_id <=", value, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdIn(List<Integer> values) {
            addCriterion("from_goods_id in", values, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdNotIn(List<Integer> values) {
            addCriterion("from_goods_id not in", values, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("from_goods_id between", value1, value2, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_goods_id not between", value1, value2, "fromGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdIsNull() {
            addCriterion("from_agent_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdIsNotNull() {
            addCriterion("from_agent_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdEqualTo(Integer value) {
            addCriterion("from_agent_goods_id =", value, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdNotEqualTo(Integer value) {
            addCriterion("from_agent_goods_id <>", value, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdGreaterThan(Integer value) {
            addCriterion("from_agent_goods_id >", value, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_agent_goods_id >=", value, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdLessThan(Integer value) {
            addCriterion("from_agent_goods_id <", value, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_agent_goods_id <=", value, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdIn(List<Integer> values) {
            addCriterion("from_agent_goods_id in", values, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdNotIn(List<Integer> values) {
            addCriterion("from_agent_goods_id not in", values, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("from_agent_goods_id between", value1, value2, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromAgentGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_agent_goods_id not between", value1, value2, "fromAgentGoodsId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdIsNull() {
            addCriterion("from_order_id is null");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdIsNotNull() {
            addCriterion("from_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdEqualTo(Integer value) {
            addCriterion("from_order_id =", value, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdNotEqualTo(Integer value) {
            addCriterion("from_order_id <>", value, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdGreaterThan(Integer value) {
            addCriterion("from_order_id >", value, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_order_id >=", value, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdLessThan(Integer value) {
            addCriterion("from_order_id <", value, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_order_id <=", value, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdIn(List<Integer> values) {
            addCriterion("from_order_id in", values, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdNotIn(List<Integer> values) {
            addCriterion("from_order_id not in", values, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("from_order_id between", value1, value2, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_order_id not between", value1, value2, "fromOrderId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIsNull() {
            addCriterion("from_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIsNotNull() {
            addCriterion("from_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdEqualTo(Integer value) {
            addCriterion("from_member_id =", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotEqualTo(Integer value) {
            addCriterion("from_member_id <>", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdGreaterThan(Integer value) {
            addCriterion("from_member_id >", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_member_id >=", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdLessThan(Integer value) {
            addCriterion("from_member_id <", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_member_id <=", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIn(List<Integer> values) {
            addCriterion("from_member_id in", values, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotIn(List<Integer> values) {
            addCriterion("from_member_id not in", values, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("from_member_id between", value1, value2, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_member_id not between", value1, value2, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelIsNull() {
            addCriterion("from_member_level is null");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelIsNotNull() {
            addCriterion("from_member_level is not null");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelEqualTo(Integer value) {
            addCriterion("from_member_level =", value, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelNotEqualTo(Integer value) {
            addCriterion("from_member_level <>", value, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelGreaterThan(Integer value) {
            addCriterion("from_member_level >", value, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_member_level >=", value, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelLessThan(Integer value) {
            addCriterion("from_member_level <", value, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelLessThanOrEqualTo(Integer value) {
            addCriterion("from_member_level <=", value, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelIn(List<Integer> values) {
            addCriterion("from_member_level in", values, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelNotIn(List<Integer> values) {
            addCriterion("from_member_level not in", values, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelBetween(Integer value1, Integer value2) {
            addCriterion("from_member_level between", value1, value2, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andFromMemberLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("from_member_level not between", value1, value2, "fromMemberLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
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

        public Criteria andProfitPriceIsNull() {
            addCriterion("profit_price is null");
            return (Criteria) this;
        }

        public Criteria andProfitPriceIsNotNull() {
            addCriterion("profit_price is not null");
            return (Criteria) this;
        }

        public Criteria andProfitPriceEqualTo(BigDecimal value) {
            addCriterion("profit_price =", value, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceNotEqualTo(BigDecimal value) {
            addCriterion("profit_price <>", value, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceGreaterThan(BigDecimal value) {
            addCriterion("profit_price >", value, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_price >=", value, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceLessThan(BigDecimal value) {
            addCriterion("profit_price <", value, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_price <=", value, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceIn(List<BigDecimal> values) {
            addCriterion("profit_price in", values, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceNotIn(List<BigDecimal> values) {
            addCriterion("profit_price not in", values, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_price between", value1, value2, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andProfitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_price not between", value1, value2, "profitPrice");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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