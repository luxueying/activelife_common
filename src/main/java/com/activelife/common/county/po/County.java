package com.activelife.common.county.po;

import com.activelife.common.base.po.BaseEntity;

/**
 * 县级信息
 * 
 * @author zhangpanfeng
 * 
 */
public class County extends BaseEntity {
    private static final long serialVersionUID = -393957980075791980L;
    /**
     * 县级编号
     */
    private String countyCode;
    /**
     * 县级名称
     */
    private String countyName;
    /**
     * 英文名称
     */
    private String enName;
    /**
     * 状态( Y: 表示可用 N: 表示不可用)
     */
    private String status;
    /**
     * 所属市编号
     */
    private String cityCode;
    /**
     * 所属市名称
     */
    private String cityName;

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
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

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
