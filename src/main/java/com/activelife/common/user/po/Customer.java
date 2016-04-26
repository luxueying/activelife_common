package com.activelife.common.user.po;

import com.activelife.common.base.po.BaseEntity;

public class Customer extends BaseEntity {
    private static final long serialVersionUID = 8380375210393218806L;
    /**
     * 用户ID
     */
    private String customerId;
    /**
     * 手机
     */
    private String phoneNumber;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户名
     */
    private String realName;
    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String headPhoto;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 地址
     */
    private String address;
    /**
     * 所属国家编号
     */
    private String countryCode;
    /**
     * 所属省编号
     */
    private String provinceCode;
    /**
     * 所属市编号
     */
    private String cityCode;
    /**
     * 所属县编号
     */
    private String countyCode;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 性别 MALE：男 FEMALE：女
     */
    private String gender;
    /**
     * 是否结婚Y：结婚 N：未结婚
     */
    private String isMarried;
    /**
     * 用户有效状态 Y：有效 N：无效
     */

    private String status;
    /**
     * 默认收件地址ID
     */
    private String addressId;
    /**
     * 删除人
     */
    private String deleteBy;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
    }

}
