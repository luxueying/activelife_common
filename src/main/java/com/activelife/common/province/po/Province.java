package com.activelife.common.province.po;

import com.activelife.common.base.po.BaseEntity;

/**
 * 省份信息
 * 
 * @author zhangpanfeng
 * 
 */
public class Province extends BaseEntity {
    private static final long serialVersionUID = -7339200132826344898L;
    /**
     * 省份编号
     */
    private String provinceCode;
    /**
     * 省名称
     */
    private String provinceName;
    /**
     * 英文名称
     */
    private String enName;
    /**
     * 状态( Y: 表示可用 N: 表示不可用)
     */
    private String status;
    /**
     * 所属国家编号
     */
    private String countryCode;
    /**
     * 所属国家名称
     */
    private String countryName;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
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

}
