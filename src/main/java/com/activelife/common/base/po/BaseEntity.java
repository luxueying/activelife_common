package com.activelife.common.base.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类
 * 
 * @author zhangpanfeng
 * 
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -7982965810132366752L;
    /**
     * 创建时间
     */
    protected Date createTime;
    /**
     * 更新时间
     */
    protected Date updateTime;
    /**
     * 删除时间
     */
    protected Date deleteTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

}
