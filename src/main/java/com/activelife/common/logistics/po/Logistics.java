package com.activelife.common.logistics.po;

import com.activelife.common.base.po.BaseEntity;

/**
 * 物流
 * 
 * @author zhangpanfeng
 * 
 */
public class Logistics extends BaseEntity {
    private static final long serialVersionUID = -7540225451520379518L;
    /**
     * 物流ID
     */
    private String logisticsId;
    /**
     * 物流公司ID
     */
    private String companyId;
    /**
     * 物流公司名称
     */
    private String companyName;
    /**
     * 运单号
     */
    private String logisticsCode;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 物流状态
     */
    private String status;
    /**
     * 物流撤回原因
     */
    private String comment;
    /**
     * 运费
     */
    private String price;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 运货人
     */
    private String principal;
    /**
     * 运货人手机
     */
    private String cellphone;

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
