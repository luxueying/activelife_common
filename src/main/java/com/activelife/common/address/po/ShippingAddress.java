package com.activelife.common.address.po;

import com.activelife.common.base.po.BaseEntity;

public class ShippingAddress extends BaseEntity {
    private static final long serialVersionUID = -5229958662792496475L;
    /**
     * 主键
     */
    private String addressId;
    /**
     * 收件人
     */
    private String consignee;
    /**
     * 收件人电话
     */
    private String cellphone;
    /**
     * 收件地址
     */
    private String address;
    /**
     * 用户ID
     */
    private String userId;

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
