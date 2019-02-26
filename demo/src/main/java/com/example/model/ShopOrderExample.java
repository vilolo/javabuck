package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrderExample() {
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeEqualTo(BigDecimal value) {
            addCriterion("shipping_fee =", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <>", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThan(BigDecimal value) {
            addCriterion("shipping_fee >", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee >=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThan(BigDecimal value) {
            addCriterion("shipping_fee <", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIn(List<BigDecimal> values) {
            addCriterion("shipping_fee in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_fee not in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee not between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(BigDecimal value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(BigDecimal value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(BigDecimal value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<BigDecimal> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(BigDecimal value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(BigDecimal value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(BigDecimal value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<BigDecimal> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("pay_money is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(BigDecimal value) {
            addCriterion("pay_money =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(BigDecimal value) {
            addCriterion("pay_money <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(BigDecimal value) {
            addCriterion("pay_money >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_money >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(BigDecimal value) {
            addCriterion("pay_money <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_money <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<BigDecimal> values) {
            addCriterion("pay_money in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<BigDecimal> values) {
            addCriterion("pay_money not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_money between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_money not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayScoreIsNull() {
            addCriterion("pay_score is null");
            return (Criteria) this;
        }

        public Criteria andPayScoreIsNotNull() {
            addCriterion("pay_score is not null");
            return (Criteria) this;
        }

        public Criteria andPayScoreEqualTo(BigDecimal value) {
            addCriterion("pay_score =", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreNotEqualTo(BigDecimal value) {
            addCriterion("pay_score <>", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreGreaterThan(BigDecimal value) {
            addCriterion("pay_score >", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_score >=", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreLessThan(BigDecimal value) {
            addCriterion("pay_score <", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_score <=", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreIn(List<BigDecimal> values) {
            addCriterion("pay_score in", values, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreNotIn(List<BigDecimal> values) {
            addCriterion("pay_score not in", values, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_score between", value1, value2, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_score not between", value1, value2, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayCouponIsNull() {
            addCriterion("pay_coupon is null");
            return (Criteria) this;
        }

        public Criteria andPayCouponIsNotNull() {
            addCriterion("pay_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andPayCouponEqualTo(BigDecimal value) {
            addCriterion("pay_coupon =", value, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponNotEqualTo(BigDecimal value) {
            addCriterion("pay_coupon <>", value, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponGreaterThan(BigDecimal value) {
            addCriterion("pay_coupon >", value, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_coupon >=", value, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponLessThan(BigDecimal value) {
            addCriterion("pay_coupon <", value, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_coupon <=", value, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponIn(List<BigDecimal> values) {
            addCriterion("pay_coupon in", values, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponNotIn(List<BigDecimal> values) {
            addCriterion("pay_coupon not in", values, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_coupon between", value1, value2, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andPayCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_coupon not between", value1, value2, "payCoupon");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Boolean value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Boolean value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Boolean value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Boolean value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Boolean> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Boolean> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Integer value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Float value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Float value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Float value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Float value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Float value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Float value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Float> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Float> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Float value1, Float value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Float value1, Float value2) {
            addCriterion("profit not between", value1, value2, "profit");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Boolean value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Boolean value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Boolean value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Boolean value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Boolean> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Boolean> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
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

        public Criteria andNoticeStatusIsNull() {
            addCriterion("notice_status is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNotNull() {
            addCriterion("notice_status is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusEqualTo(Boolean value) {
            addCriterion("notice_status =", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotEqualTo(Boolean value) {
            addCriterion("notice_status <>", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThan(Boolean value) {
            addCriterion("notice_status >", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("notice_status >=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThan(Boolean value) {
            addCriterion("notice_status <", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("notice_status <=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIn(List<Boolean> values) {
            addCriterion("notice_status in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotIn(List<Boolean> values) {
            addCriterion("notice_status not in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("notice_status between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("notice_status not between", value1, value2, "noticeStatus");
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

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andQIdIsNull() {
            addCriterion("q_id is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("q_id is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(Integer value) {
            addCriterion("q_id =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(Integer value) {
            addCriterion("q_id <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(Integer value) {
            addCriterion("q_id >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_id >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(Integer value) {
            addCriterion("q_id <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(Integer value) {
            addCriterion("q_id <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<Integer> values) {
            addCriterion("q_id in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<Integer> values) {
            addCriterion("q_id not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(Integer value1, Integer value2) {
            addCriterion("q_id between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(Integer value1, Integer value2) {
            addCriterion("q_id not between", value1, value2, "qId");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andExpressIsNull() {
            addCriterion("express is null");
            return (Criteria) this;
        }

        public Criteria andExpressIsNotNull() {
            addCriterion("express is not null");
            return (Criteria) this;
        }

        public Criteria andExpressEqualTo(Short value) {
            addCriterion("express =", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotEqualTo(Short value) {
            addCriterion("express <>", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressGreaterThan(Short value) {
            addCriterion("express >", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressGreaterThanOrEqualTo(Short value) {
            addCriterion("express >=", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressLessThan(Short value) {
            addCriterion("express <", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressLessThanOrEqualTo(Short value) {
            addCriterion("express <=", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressIn(List<Short> values) {
            addCriterion("express in", values, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotIn(List<Short> values) {
            addCriterion("express not in", values, "express");
            return (Criteria) this;
        }

        public Criteria andExpressBetween(Short value1, Short value2) {
            addCriterion("express between", value1, value2, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotBetween(Short value1, Short value2) {
            addCriterion("express not between", value1, value2, "express");
            return (Criteria) this;
        }

        public Criteria andExpressSnIsNull() {
            addCriterion("express_sn is null");
            return (Criteria) this;
        }

        public Criteria andExpressSnIsNotNull() {
            addCriterion("express_sn is not null");
            return (Criteria) this;
        }

        public Criteria andExpressSnEqualTo(String value) {
            addCriterion("express_sn =", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotEqualTo(String value) {
            addCriterion("express_sn <>", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnGreaterThan(String value) {
            addCriterion("express_sn >", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnGreaterThanOrEqualTo(String value) {
            addCriterion("express_sn >=", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLessThan(String value) {
            addCriterion("express_sn <", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLessThanOrEqualTo(String value) {
            addCriterion("express_sn <=", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLike(String value) {
            addCriterion("express_sn like", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotLike(String value) {
            addCriterion("express_sn not like", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnIn(List<String> values) {
            addCriterion("express_sn in", values, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotIn(List<String> values) {
            addCriterion("express_sn not in", values, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnBetween(String value1, String value2) {
            addCriterion("express_sn between", value1, value2, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotBetween(String value1, String value2) {
            addCriterion("express_sn not between", value1, value2, "expressSn");
            return (Criteria) this;
        }

        public Criteria andShipperCodeIsNull() {
            addCriterion("shipper_code is null");
            return (Criteria) this;
        }

        public Criteria andShipperCodeIsNotNull() {
            addCriterion("shipper_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipperCodeEqualTo(String value) {
            addCriterion("shipper_code =", value, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeNotEqualTo(String value) {
            addCriterion("shipper_code <>", value, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeGreaterThan(String value) {
            addCriterion("shipper_code >", value, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipper_code >=", value, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeLessThan(String value) {
            addCriterion("shipper_code <", value, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeLessThanOrEqualTo(String value) {
            addCriterion("shipper_code <=", value, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeLike(String value) {
            addCriterion("shipper_code like", value, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeNotLike(String value) {
            addCriterion("shipper_code not like", value, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeIn(List<String> values) {
            addCriterion("shipper_code in", values, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeNotIn(List<String> values) {
            addCriterion("shipper_code not in", values, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeBetween(String value1, String value2) {
            addCriterion("shipper_code between", value1, value2, "shipperCode");
            return (Criteria) this;
        }

        public Criteria andShipperCodeNotBetween(String value1, String value2) {
            addCriterion("shipper_code not between", value1, value2, "shipperCode");
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

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Integer value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Integer value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Integer value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Integer value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Integer> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Integer> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Integer value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Integer value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Integer value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Integer value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Integer value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Integer> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Integer> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Integer value1, Integer value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeIsNull() {
            addCriterion("profit_time is null");
            return (Criteria) this;
        }

        public Criteria andProfitTimeIsNotNull() {
            addCriterion("profit_time is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTimeEqualTo(Integer value) {
            addCriterion("profit_time =", value, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeNotEqualTo(Integer value) {
            addCriterion("profit_time <>", value, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeGreaterThan(Integer value) {
            addCriterion("profit_time >", value, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("profit_time >=", value, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeLessThan(Integer value) {
            addCriterion("profit_time <", value, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("profit_time <=", value, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeIn(List<Integer> values) {
            addCriterion("profit_time in", values, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeNotIn(List<Integer> values) {
            addCriterion("profit_time not in", values, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeBetween(Integer value1, Integer value2) {
            addCriterion("profit_time between", value1, value2, "profitTime");
            return (Criteria) this;
        }

        public Criteria andProfitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("profit_time not between", value1, value2, "profitTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Integer value) {
            addCriterion("notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Integer value) {
            addCriterion("notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Integer value) {
            addCriterion("notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Integer value) {
            addCriterion("notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Integer> values) {
            addCriterion("notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Integer> values) {
            addCriterion("notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Integer value1, Integer value2) {
            addCriterion("notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_time not between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Integer value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Integer value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Integer value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Integer value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Integer> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Integer> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Integer value1, Integer value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeMsgIsNull() {
            addCriterion("change_msg is null");
            return (Criteria) this;
        }

        public Criteria andChangeMsgIsNotNull() {
            addCriterion("change_msg is not null");
            return (Criteria) this;
        }

        public Criteria andChangeMsgEqualTo(String value) {
            addCriterion("change_msg =", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgNotEqualTo(String value) {
            addCriterion("change_msg <>", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgGreaterThan(String value) {
            addCriterion("change_msg >", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgGreaterThanOrEqualTo(String value) {
            addCriterion("change_msg >=", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgLessThan(String value) {
            addCriterion("change_msg <", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgLessThanOrEqualTo(String value) {
            addCriterion("change_msg <=", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgLike(String value) {
            addCriterion("change_msg like", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgNotLike(String value) {
            addCriterion("change_msg not like", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgIn(List<String> values) {
            addCriterion("change_msg in", values, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgNotIn(List<String> values) {
            addCriterion("change_msg not in", values, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgBetween(String value1, String value2) {
            addCriterion("change_msg between", value1, value2, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgNotBetween(String value1, String value2) {
            addCriterion("change_msg not between", value1, value2, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeAdminIsNull() {
            addCriterion("change_admin is null");
            return (Criteria) this;
        }

        public Criteria andChangeAdminIsNotNull() {
            addCriterion("change_admin is not null");
            return (Criteria) this;
        }

        public Criteria andChangeAdminEqualTo(String value) {
            addCriterion("change_admin =", value, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminNotEqualTo(String value) {
            addCriterion("change_admin <>", value, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminGreaterThan(String value) {
            addCriterion("change_admin >", value, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminGreaterThanOrEqualTo(String value) {
            addCriterion("change_admin >=", value, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminLessThan(String value) {
            addCriterion("change_admin <", value, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminLessThanOrEqualTo(String value) {
            addCriterion("change_admin <=", value, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminLike(String value) {
            addCriterion("change_admin like", value, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminNotLike(String value) {
            addCriterion("change_admin not like", value, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminIn(List<String> values) {
            addCriterion("change_admin in", values, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminNotIn(List<String> values) {
            addCriterion("change_admin not in", values, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminBetween(String value1, String value2) {
            addCriterion("change_admin between", value1, value2, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andChangeAdminNotBetween(String value1, String value2) {
            addCriterion("change_admin not between", value1, value2, "changeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Integer value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Integer value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Integer value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Integer value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Integer> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Integer> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Integer value1, Integer value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseMsgIsNull() {
            addCriterion("close_msg is null");
            return (Criteria) this;
        }

        public Criteria andCloseMsgIsNotNull() {
            addCriterion("close_msg is not null");
            return (Criteria) this;
        }

        public Criteria andCloseMsgEqualTo(String value) {
            addCriterion("close_msg =", value, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgNotEqualTo(String value) {
            addCriterion("close_msg <>", value, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgGreaterThan(String value) {
            addCriterion("close_msg >", value, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgGreaterThanOrEqualTo(String value) {
            addCriterion("close_msg >=", value, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgLessThan(String value) {
            addCriterion("close_msg <", value, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgLessThanOrEqualTo(String value) {
            addCriterion("close_msg <=", value, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgLike(String value) {
            addCriterion("close_msg like", value, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgNotLike(String value) {
            addCriterion("close_msg not like", value, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgIn(List<String> values) {
            addCriterion("close_msg in", values, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgNotIn(List<String> values) {
            addCriterion("close_msg not in", values, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgBetween(String value1, String value2) {
            addCriterion("close_msg between", value1, value2, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseMsgNotBetween(String value1, String value2) {
            addCriterion("close_msg not between", value1, value2, "closeMsg");
            return (Criteria) this;
        }

        public Criteria andCloseAdminIsNull() {
            addCriterion("close_admin is null");
            return (Criteria) this;
        }

        public Criteria andCloseAdminIsNotNull() {
            addCriterion("close_admin is not null");
            return (Criteria) this;
        }

        public Criteria andCloseAdminEqualTo(String value) {
            addCriterion("close_admin =", value, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminNotEqualTo(String value) {
            addCriterion("close_admin <>", value, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminGreaterThan(String value) {
            addCriterion("close_admin >", value, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminGreaterThanOrEqualTo(String value) {
            addCriterion("close_admin >=", value, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminLessThan(String value) {
            addCriterion("close_admin <", value, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminLessThanOrEqualTo(String value) {
            addCriterion("close_admin <=", value, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminLike(String value) {
            addCriterion("close_admin like", value, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminNotLike(String value) {
            addCriterion("close_admin not like", value, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminIn(List<String> values) {
            addCriterion("close_admin in", values, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminNotIn(List<String> values) {
            addCriterion("close_admin not in", values, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminBetween(String value1, String value2) {
            addCriterion("close_admin between", value1, value2, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andCloseAdminNotBetween(String value1, String value2) {
            addCriterion("close_admin not between", value1, value2, "closeAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIsNull() {
            addCriterion("refund_apply_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIsNotNull() {
            addCriterion("refund_apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeEqualTo(Integer value) {
            addCriterion("refund_apply_time =", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotEqualTo(Integer value) {
            addCriterion("refund_apply_time <>", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeGreaterThan(Integer value) {
            addCriterion("refund_apply_time >", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_apply_time >=", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeLessThan(Integer value) {
            addCriterion("refund_apply_time <", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("refund_apply_time <=", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIn(List<Integer> values) {
            addCriterion("refund_apply_time in", values, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotIn(List<Integer> values) {
            addCriterion("refund_apply_time not in", values, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeBetween(Integer value1, Integer value2) {
            addCriterion("refund_apply_time between", value1, value2, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_apply_time not between", value1, value2, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Integer value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Integer value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Integer value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Integer value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Integer value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Integer> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Integer> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Integer value1, Integer value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIsNull() {
            addCriterion("refund_price is null");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIsNotNull() {
            addCriterion("refund_price is not null");
            return (Criteria) this;
        }

        public Criteria andRefundPriceEqualTo(BigDecimal value) {
            addCriterion("refund_price =", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotEqualTo(BigDecimal value) {
            addCriterion("refund_price <>", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceGreaterThan(BigDecimal value) {
            addCriterion("refund_price >", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_price >=", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceLessThan(BigDecimal value) {
            addCriterion("refund_price <", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_price <=", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIn(List<BigDecimal> values) {
            addCriterion("refund_price in", values, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotIn(List<BigDecimal> values) {
            addCriterion("refund_price not in", values, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_price between", value1, value2, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_price not between", value1, value2, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundExpressIsNull() {
            addCriterion("refund_express is null");
            return (Criteria) this;
        }

        public Criteria andRefundExpressIsNotNull() {
            addCriterion("refund_express is not null");
            return (Criteria) this;
        }

        public Criteria andRefundExpressEqualTo(String value) {
            addCriterion("refund_express =", value, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNotEqualTo(String value) {
            addCriterion("refund_express <>", value, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressGreaterThan(String value) {
            addCriterion("refund_express >", value, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressGreaterThanOrEqualTo(String value) {
            addCriterion("refund_express >=", value, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressLessThan(String value) {
            addCriterion("refund_express <", value, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressLessThanOrEqualTo(String value) {
            addCriterion("refund_express <=", value, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressLike(String value) {
            addCriterion("refund_express like", value, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNotLike(String value) {
            addCriterion("refund_express not like", value, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressIn(List<String> values) {
            addCriterion("refund_express in", values, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNotIn(List<String> values) {
            addCriterion("refund_express not in", values, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressBetween(String value1, String value2) {
            addCriterion("refund_express between", value1, value2, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNotBetween(String value1, String value2) {
            addCriterion("refund_express not between", value1, value2, "refundExpress");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoIsNull() {
            addCriterion("refund_express_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoIsNotNull() {
            addCriterion("refund_express_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoEqualTo(String value) {
            addCriterion("refund_express_no =", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoNotEqualTo(String value) {
            addCriterion("refund_express_no <>", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoGreaterThan(String value) {
            addCriterion("refund_express_no >", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_express_no >=", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoLessThan(String value) {
            addCriterion("refund_express_no <", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoLessThanOrEqualTo(String value) {
            addCriterion("refund_express_no <=", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoLike(String value) {
            addCriterion("refund_express_no like", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoNotLike(String value) {
            addCriterion("refund_express_no not like", value, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoIn(List<String> values) {
            addCriterion("refund_express_no in", values, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoNotIn(List<String> values) {
            addCriterion("refund_express_no not in", values, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoBetween(String value1, String value2) {
            addCriterion("refund_express_no between", value1, value2, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundExpressNoNotBetween(String value1, String value2) {
            addCriterion("refund_express_no not between", value1, value2, "refundExpressNo");
            return (Criteria) this;
        }

        public Criteria andRefundMsgIsNull() {
            addCriterion("refund_msg is null");
            return (Criteria) this;
        }

        public Criteria andRefundMsgIsNotNull() {
            addCriterion("refund_msg is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMsgEqualTo(String value) {
            addCriterion("refund_msg =", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgNotEqualTo(String value) {
            addCriterion("refund_msg <>", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgGreaterThan(String value) {
            addCriterion("refund_msg >", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgGreaterThanOrEqualTo(String value) {
            addCriterion("refund_msg >=", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgLessThan(String value) {
            addCriterion("refund_msg <", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgLessThanOrEqualTo(String value) {
            addCriterion("refund_msg <=", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgLike(String value) {
            addCriterion("refund_msg like", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgNotLike(String value) {
            addCriterion("refund_msg not like", value, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgIn(List<String> values) {
            addCriterion("refund_msg in", values, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgNotIn(List<String> values) {
            addCriterion("refund_msg not in", values, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgBetween(String value1, String value2) {
            addCriterion("refund_msg between", value1, value2, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundMsgNotBetween(String value1, String value2) {
            addCriterion("refund_msg not between", value1, value2, "refundMsg");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIsNull() {
            addCriterion("refund_admin is null");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIsNotNull() {
            addCriterion("refund_admin is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAdminEqualTo(String value) {
            addCriterion("refund_admin =", value, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNotEqualTo(String value) {
            addCriterion("refund_admin <>", value, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminGreaterThan(String value) {
            addCriterion("refund_admin >", value, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminGreaterThanOrEqualTo(String value) {
            addCriterion("refund_admin >=", value, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminLessThan(String value) {
            addCriterion("refund_admin <", value, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminLessThanOrEqualTo(String value) {
            addCriterion("refund_admin <=", value, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminLike(String value) {
            addCriterion("refund_admin like", value, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNotLike(String value) {
            addCriterion("refund_admin not like", value, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIn(List<String> values) {
            addCriterion("refund_admin in", values, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNotIn(List<String> values) {
            addCriterion("refund_admin not in", values, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminBetween(String value1, String value2) {
            addCriterion("refund_admin between", value1, value2, "refundAdmin");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNotBetween(String value1, String value2) {
            addCriterion("refund_admin not between", value1, value2, "refundAdmin");
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

        public Criteria andIsUpdateOrderIsNull() {
            addCriterion("is_update_order is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderIsNotNull() {
            addCriterion("is_update_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderEqualTo(Boolean value) {
            addCriterion("is_update_order =", value, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderNotEqualTo(Boolean value) {
            addCriterion("is_update_order <>", value, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderGreaterThan(Boolean value) {
            addCriterion("is_update_order >", value, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_update_order >=", value, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderLessThan(Boolean value) {
            addCriterion("is_update_order <", value, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("is_update_order <=", value, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderIn(List<Boolean> values) {
            addCriterion("is_update_order in", values, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderNotIn(List<Boolean> values) {
            addCriterion("is_update_order not in", values, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("is_update_order between", value1, value2, "isUpdateOrder");
            return (Criteria) this;
        }

        public Criteria andIsUpdateOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_update_order not between", value1, value2, "isUpdateOrder");
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