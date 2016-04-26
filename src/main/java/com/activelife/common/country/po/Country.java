package com.activelife.common.country.po;

import com.activelife.common.base.po.BaseEntity;

/**
 * 国家类
 * 
 * @author zhangpanfeng
 * 
 */
public class Country extends BaseEntity {
    private static final long serialVersionUID = 23387279678520179L;
    /**
     * 国家编号
     */
    private String countryCode;
    /**
     * 国家名称
     */
    private String countryName;
    /**
     * 英文名称
     */
    private String enName;
    /**
     * 状态( Y: 表示可用 N: 表示不可用)
     */
    private String status;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
