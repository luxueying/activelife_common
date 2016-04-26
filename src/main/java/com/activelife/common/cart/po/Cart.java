package com.activelife.common.cart.po;

import com.activelife.common.base.po.BaseEntity;

public class Cart extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String ord_id; // 商品加入购物车的唯一编号
    private String pro_id; // 产品id
    private String pro_name; // 商品名称
    private String product_standard; // 产品规格
    private double product_price; // 价格
    private int product_num; // 购买数
    private String user_id; // 用户唯一标识

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(String ord_id) {
        this.ord_id = ord_id;
    }

    public String getPro_id() {
        return pro_id;
    }

    public void setPro_id(String pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getProduct_standard() {
        return product_standard;
    }

    public void setProduct_standard(String product_standard) {
        this.product_standard = product_standard;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public int getProduct_num() {
        return product_num;
    }

    public void setProduct_num(int product_num) {
        this.product_num = product_num;
    }
}
