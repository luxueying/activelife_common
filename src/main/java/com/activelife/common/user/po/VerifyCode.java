package com.activelife.common.user.po;

import com.activelife.common.base.po.BaseEntity;

public class VerifyCode extends BaseEntity{
    private static final long serialVersionUID = 4257733132916302977L;
    /**
     * 验证码ID
     */
    private String verifyCodeId;
    /**
     * 验证码
     */
    private String verifyCode;
    /**
     * 手机号
     */
    private String phoneNumber;

    public String getVerifyCodeId() {
        return verifyCodeId;
    }

    public void setVerifyCodeId(String verifyCodeId) {
        this.verifyCodeId = verifyCodeId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
