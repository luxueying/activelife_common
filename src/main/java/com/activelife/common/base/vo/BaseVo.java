package com.activelife.common.base.vo;

import java.io.Serializable;
import java.util.Date;

public class BaseVo implements Serializable {
    private static final long serialVersionUID = 962105206884922662L;
    /**
     * 创建时间
     */
    protected String createTime;
    /**
     * 更新时间
     */
    protected String updateTime;
    /**
     * 删除时间
     */
    protected String deleteTime;
    /**
     * 创建开始时间
     */
    protected Date createTimeBegin;
    /**
     * 创建结束时间
     */
    protected Date createTimeEnd;
    /**
     * 创建人
     */
    protected String createBy;
    /**
     * 更新人
     */
    protected String updateBy;
    /**
     * 删除人
     */
    protected String deleteBy;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Date getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(Date createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
    }

}
