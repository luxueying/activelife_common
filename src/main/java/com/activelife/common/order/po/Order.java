package com.activelife.common.order.po;

import com.activelife.common.base.po.BaseEntity;

/**
 * 订单
 */
public class Order extends BaseEntity {
    private static final long serialVersionUID = 3166212563972706976L;
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
    private double price;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 删除人
     */
    private String deleteBy;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
