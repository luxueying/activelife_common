package com.activelife.common.user.vo;

import com.activelife.common.base.vo.BaseVo;

public class CustomerVo extends BaseVo {
    private static final long serialVersionUID = -1807494007862098912L;
    /**
     * 用户ID
     */
    private String customerId;
    /**
     * 手机
     */
    private String phoneNumber;

	/**
     * 用户名
     */
    private String realName;
	/**
     * 昵称
     */
    private String nickName;

    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String headPhoto;
    /**
     * QQ号
     */
    private String qqNumber;
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
     * 是否结婚Y：结婚 N：未结婚
     */
    private String isMarried;
    /**
     * 生日
     */
    private String birthday;
   
    /**
     * 性别 MALE：男 FEMALE：女
     */
    private String gender;
    /**
     * 用户有效状态 Y：有效 N：无效
     */
    private String status;
    /**
     * 默认收件地址ID
     */
    private String addressId;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 确认密码
     */
    private String confirmPassword;
    /**
     * 新密码
     */
    private String newPassword;
    /**
     * 验证码
     */
    private String validateCode;
    /**
     * 起点横坐标
     */
    private String x;
    /**
     * 起点纵坐标
     */
    private String y;
    /**
     * 宽度
     */
    private String width;
    /**
     * 高度
     */
    private String height;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
	  public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
	public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
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

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public int getX() {
        return Integer.valueOf(x);
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return Integer.valueOf(y);
    }

    public void setY(String y) {
        this.y = y;
    }

    public int getWidth() {
        return Integer.valueOf(width);
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public int getHeight() {
        return Integer.valueOf(height);
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
