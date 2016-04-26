package com.activelife.common.product.vo;

import com.activelife.common.base.vo.BaseVo;

public class ProductVo extends BaseVo {
    private static final long serialVersionUID = -3031242966919556406L;
    /**
     * 产品ID
     */
    private String productId;
    /**
     * 产品编号
     */
    private String productCode;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品国家名称
     */
    private String countryName;
    /**
     * 产品省份名称
     */
    private String provinceName;
    /**
     * 产品所属市名称
     */
    private String cityName;
    /**
     * 产品所属县名称
     */
    private String countyName;
    /**
     * 产品价格
     */
    private String price;
    /**
     * 产品老价格
     */
    private String oldPrice;
    /**
     * 产品地址
     */
    private String address;
    /**
     * 库存
     */
    private String stock;
    /**
     * 产品审核状态，包含 AUDITED_APPROVED("审核通过"), AUDITED_REJECTED("审核未通过"), UNAUDITED("未审核")
     */
    private String status;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
