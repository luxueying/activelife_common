package com.activelife.common.exception;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 5632708980681492819L;
    private String errorCode;
    private String message;

    public BusinessException(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public BusinessException(String errorCode, String message, Throwable throwable) {
        super(message, throwable);
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("异常代码：[" + this.errorCode + "] ").append("异常消息：[" + this.message + "]");

        return builder.toString();
    }
}
