package com.activelife.common.city.po;

import com.activelife.common.base.po.BaseEntity;

/**
 * 城市
 * 
 * @author zhangpanfeng
 * 
 */
public class City extends BaseEntity {
    private static final long serialVersionUID = 9109859379732382491L;
    /**
     * 市级编号
     */
    private String cityCode;
    /**
     * 市级名称
     */
    private String cityName;
    /**
     * 英文名称
     */
    private String enName;
    /**
     * 状态( Y: 表示可用 N: 表示不可用)
     */
    private String status;
    /**
     * 所属省级编号
     */
    private String provinceCode;
    /**
     * 所属省份名称
     */
    private String provinceName;

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

}
