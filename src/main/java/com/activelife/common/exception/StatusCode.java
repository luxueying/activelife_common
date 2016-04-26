package com.activelife.common.exception;

public class StatusCode {
    /**
     * 成功代码
     */
    public static final String SUCCESS = "200";
    /**
     * 创建错误代码
     */
    public static final String CREATE_ERROR = "101";
    /**
     * 读取错误代码
     */
    public static final String READ_ERROR = "102";
    /**
     * 更新错误代码
     */
    public static final String UPDATE_ERROR = "103";
    /**
     * 删除错误代码
     */
    public static final String DELETE_ERROR = "104";

    //

    /**
     * Session 超时
     */
    public static final String SESSION_TIME_OUT = "501";
    /**
     * 没有权限
     */
    public static final String AUTHORITY_ERROR = "502";

}
