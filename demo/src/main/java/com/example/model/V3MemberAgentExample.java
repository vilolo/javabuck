package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V3MemberAgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V3MemberAgentExample() {
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

        public Criteria andLevelIdIsNull() {
            addCriterion("level_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("level_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(Integer value) {
            addCriterion("level_id =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(Integer value) {
            addCriterion("level_id <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(Integer value) {
            addCriterion("level_id >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_id >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(Integer value) {
            addCriterion("level_id <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("level_id <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<Integer> values) {
            addCriterion("level_id in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<Integer> values) {
            addCriterion("level_id not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("level_id between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("level_id not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andAreaNamesIsNull() {
            addCriterion("area_names is null");
            return (Criteria) this;
        }

        public Criteria andAreaNamesIsNotNull() {
            addCriterion("area_names is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNamesEqualTo(String value) {
            addCriterion("area_names =", value, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesNotEqualTo(String value) {
            addCriterion("area_names <>", value, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesGreaterThan(String value) {
            addCriterion("area_names >", value, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesGreaterThanOrEqualTo(String value) {
            addCriterion("area_names >=", value, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesLessThan(String value) {
            addCriterion("area_names <", value, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesLessThanOrEqualTo(String value) {
            addCriterion("area_names <=", value, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesLike(String value) {
            addCriterion("area_names like", value, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesNotLike(String value) {
            addCriterion("area_names not like", value, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesIn(List<String> values) {
            addCriterion("area_names in", values, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesNotIn(List<String> values) {
            addCriterion("area_names not in", values, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesBetween(String value1, String value2) {
            addCriterion("area_names between", value1, value2, "areaNames");
            return (Criteria) this;
        }

        public Criteria andAreaNamesNotBetween(String value1, String value2) {
            addCriterion("area_names not between", value1, value2, "areaNames");
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