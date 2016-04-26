package com.activelife.common.vo;

import java.util.HashMap;
import java.util.Map;

import com.activelife.common.exception.StatusCode;

/**
 * 客户端的消息类
 * 
 * @author zhangpanfeng
 * 
 */
public class ClientMessage {
    /**
     * 消息
     */
    private String message;
    /**
     * 跳转链接
     */
    private String href;
    /**
     * 跳转目标名称
     */
    private String target;
    /**
     * 状态码
     */
    private String statusCode = StatusCode.SUCCESS;
    /**
     * 其他属性
     */
    private Map<String, Object> attribute = new HashMap<String, Object>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public void addAttribute(String key, Object value) {
        this.attribute.put(key, value);
    }

    public Map<String, Object> getAttribute() {
        return attribute;
    }

}
