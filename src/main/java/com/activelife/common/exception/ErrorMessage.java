package com.activelife.common.exception;

public class ErrorMessage {
    /**
     * 创建错误信息
     */
    public static final String CREATE_ERROR = "创建失败！";

    public static final String CREATE_ERROR(String methodName, Object param) {

        return CREATE_ERROR + " 方法名：<" + methodName + "> 参数：" + param;
    }

    /**
     * 读取错误信息
     */
    public static final String READ_ERROR = "读取失败！";

    public static final String READ_ERROR(String methodName, Object param) {

        return READ_ERROR + " 方法名：<" + methodName + "> 参数：" + param;
    }

    /**
     * 更新错误信息
     */
    public static final String UPDATE_ERROR = "更新失败！";

    public static final String UPDATE_ERROR(String methodName, Object param) {

        return UPDATE_ERROR + " 方法名：<" + methodName + "> 参数：" + param;
    }

    /**
     * 删除错误信息
     */
    public static final String DELETE_ERROR = "删除失败！";

    public static final String DELETE_ERROR(String methodName, Object param) {

        return DELETE_ERROR + " 方法名：<" + methodName + "> 参数：" + param;
    }

    /**
     * Session 超时
     */
    public static final String SESSION_TIME_OUT = "Session 超时！";

    /**
     * 没有权限
     */
    public static final String AUTHORITY_ERROR = "您没有操作权限！";

    public static String getClientMessage(String errorCode) {
        if (StatusCode.CREATE_ERROR.equals(errorCode)) {
            return CREATE_ERROR;
        } else if (StatusCode.READ_ERROR.equals(errorCode)) {
            return READ_ERROR;
        } else if (StatusCode.UPDATE_ERROR.equals(errorCode)) {
            return UPDATE_ERROR;
        } else if (StatusCode.DELETE_ERROR.equals(errorCode)) {
            return DELETE_ERROR;
        } else if (StatusCode.SESSION_TIME_OUT.equals(errorCode)) {
            return SESSION_TIME_OUT;
        } else if (StatusCode.AUTHORITY_ERROR.equals(errorCode)) {
            return AUTHORITY_ERROR;
        } else {
            return null;
        }
    }
}
