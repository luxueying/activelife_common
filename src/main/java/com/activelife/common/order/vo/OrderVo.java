package com.activelife.common.order.vo;

import com.activelife.common.base.vo.BaseVo;

public class OrderVo extends BaseVo {
    private static final long serialVersionUID = 1177769346177374225L;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 订单状态 CANCEL("取消"), SEND("已发货"), SEND_BACK("退货"), FINISH("完成")
     */
    private String status;
    /**
     * 订单支付状态 PAIED("已付款"), UNPAIED("未付款"), CASH_ON_DELIVERY("货到付款")
     */
    private String paymentStatus;
    /**
     * 订单金额
     */
    private String price;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
