package com.activelife.common.logistics.po;

import com.activelife.common.base.po.BaseEntity;

/**
 * 物流公司
 * 
 * @author zhangpanfeng
 * 
 */
public class LogisticsCompany extends BaseEntity {
    private static final long serialVersionUID = -7868852737234962158L;
    /**
     * 物流公司ID
     */
    private String companyId;
    /**
     * 物流公司名称
     */
    private String companyName;
    /**
     * 物流公司电话
     */
    private String companyPhone;
    /**
     * 物流公司负责人
     */
    private String principal;
    /**
     * 负责人电话
     */
    private String telephone;
    /**
     * 负责人手机
     */
    private String cellphone;
    /**
     * 物流公司状态 (Y:有效 N:无效)
     */
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

}
