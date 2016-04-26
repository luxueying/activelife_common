package com.activelife.common.vo;

import java.io.Serializable;

/**
 * 远程调用的返回对象
 * 
 * @author zhangpanfeng
 * 
 * @param <T>
 */
public class ResultHandle<T> implements Serializable {
    private static final long serialVersionUID = -5396872858744255371L;
    /**
     * 标示是否请求成功
     */
    private boolean isSuccess = true;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 错误代码
     */
    private String errorCode;
    /**
     * 返回内容
     */
    private T content;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
