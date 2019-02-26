package com.example.model;

import java.math.BigDecimal;

public class ShopOrder {
    private Integer id;

    private String sn;

    private Integer memberId;

    private BigDecimal price;

    private BigDecimal goodsPrice;

    private Integer goodsNum;

    private BigDecimal shippingFee;

    private BigDecimal payFee;

    private BigDecimal discount;

    private BigDecimal payPrice;

    private BigDecimal payMoney;

    private BigDecimal payScore;

    private BigDecimal payCoupon;

    private Boolean isPay;

    private String payType;

    private Integer payTime;

    private String transactionId;

    private Float profit;

    private Byte status;

    private BigDecimal score;

    private Boolean checkStatus;

    private Boolean profitStatus;

    private Boolean noticeStatus;

    private String remark;

    private String msg;

    private Integer gId;

    private Integer sId;

    private Integer dId;

    private Integer qId;

    private String address;

    private String phone;

    private String consignee;

    private Short express;

    private String expressSn;

    private String shipperCode;

    private Integer createTime;

    private Integer deliveryTime;

    private Integer completeTime;

    private Integer profitTime;

    private Integer noticeTime;

    private Integer changeTime;

    private String changeMsg;

    private String changeAdmin;

    private Integer closeTime;

    private String closeMsg;

    private String closeAdmin;

    private Integer refundApplyTime;

    private Integer refundTime;

    private BigDecimal refundPrice;

    private String refundExpress;

    private String refundExpressNo;

    private String refundMsg;

    private String refundAdmin;

    private Boolean goodsLevel;

    private Boolean isUpdateOrder;

    private String items;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public BigDecimal getPayScore() {
        return payScore;
    }

    public void setPayScore(BigDecimal payScore) {
        this.payScore = payScore;
    }

    public BigDecimal getPayCoupon() {
        return payCoupon;
    }

    public void setPayCoupon(BigDecimal payCoupon) {
        this.payCoupon = payCoupon;
    }

    public Boolean getIsPay() {
        return isPay;
    }

    public void setIsPay(Boolean isPay) {
        this.isPay = isPay;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Float getProfit() {
        return profit;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Boolean getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Boolean checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Boolean getProfitStatus() {
        return profitStatus;
    }

    public void setProfitStatus(Boolean profitStatus) {
        this.profitStatus = profitStatus;
    }

    public Boolean getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Boolean noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public Short getExpress() {
        return express;
    }

    public void setExpress(Short express) {
        this.express = express;
    }

    public String getExpressSn() {
        return expressSn;
    }

    public void setExpressSn(String expressSn) {
        this.expressSn = expressSn == null ? null : expressSn.trim();
    }

    public String getShipperCode() {
        return shipperCode;
    }

    public void setShipperCode(String shipperCode) {
        this.shipperCode = shipperCode == null ? null : shipperCode.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Integer completeTime) {
        this.completeTime = completeTime;
    }

    public Integer getProfitTime() {
        return profitTime;
    }

    public void setProfitTime(Integer profitTime) {
        this.profitTime = profitTime;
    }

    public Integer getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Integer noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Integer getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Integer changeTime) {
        this.changeTime = changeTime;
    }

    public String getChangeMsg() {
        return changeMsg;
    }

    public void setChangeMsg(String changeMsg) {
        this.changeMsg = changeMsg == null ? null : changeMsg.trim();
    }

    public String getChangeAdmin() {
        return changeAdmin;
    }

    public void setChangeAdmin(String changeAdmin) {
        this.changeAdmin = changeAdmin == null ? null : changeAdmin.trim();
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public String getCloseMsg() {
        return closeMsg;
    }

    public void setCloseMsg(String closeMsg) {
        this.closeMsg = closeMsg == null ? null : closeMsg.trim();
    }

    public String getCloseAdmin() {
        return closeAdmin;
    }

    public void setCloseAdmin(String closeAdmin) {
        this.closeAdmin = closeAdmin == null ? null : closeAdmin.trim();
    }

    public Integer getRefundApplyTime() {
        return refundApplyTime;
    }

    public void setRefundApplyTime(Integer refundApplyTime) {
        this.refundApplyTime = refundApplyTime;
    }

    public Integer getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
    }

    public BigDecimal getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(BigDecimal refundPrice) {
        this.refundPrice = refundPrice;
    }

    public String getRefundExpress() {
        return refundExpress;
    }

    public void setRefundExpress(String refundExpress) {
        this.refundExpress = refundExpress == null ? null : refundExpress.trim();
    }

    public String getRefundExpressNo() {
        return refundExpressNo;
    }

    public void setRefundExpressNo(String refundExpressNo) {
        this.refundExpressNo = refundExpressNo == null ? null : refundExpressNo.trim();
    }

    public String getRefundMsg() {
        return refundMsg;
    }

    public void setRefundMsg(String refundMsg) {
        this.refundMsg = refundMsg == null ? null : refundMsg.trim();
    }

    public String getRefundAdmin() {
        return refundAdmin;
    }

    public void setRefundAdmin(String refundAdmin) {
        this.refundAdmin = refundAdmin == null ? null : refundAdmin.trim();
    }

    public Boolean getGoodsLevel() {
        return goodsLevel;
    }

    public void setGoodsLevel(Boolean goodsLevel) {
        this.goodsLevel = goodsLevel;
    }

    public Boolean getIsUpdateOrder() {
        return isUpdateOrder;
    }

    public void setIsUpdateOrder(Boolean isUpdateOrder) {
        this.isUpdateOrder = isUpdateOrder;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items == null ? null : items.trim();
    }
}