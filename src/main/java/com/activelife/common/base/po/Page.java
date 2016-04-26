package com.activelife.common.base.po;

/**
 * 分页类
 * 
 * @author zhangpanfeng
 * 
 */
public class Page {
    /**
     * 默认页大小
     */
    private static final int DEFAULT_PAGE_SIZE = 10;
    /**
     * 默认排序列
     */
    private static final String DEFAULT_ORDER_BY = "create_time";
    /**
     * 默认降序
     */
    private static final String DEFAULT_ORDER = "desc";
    /**
     * 第几页
     */
    private int page = 1;
    /**
     * 共多少条数据
     */
    private int totalSize = 0;
    /**
     * 其实下标
     */
    private int pageStart;
    /**
     * 页大小
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int totalPages;
    /**
     * 排序字段
     */
    private String pageOrderBy;
    /**
     * 升序或降序
     */
    private String pageOrder;
    /**
     * 分页URL
     */
    private String url;

    public int getPageStart() {
        pageStart = (getPage() - 1) * getPageSize();

        return pageStart;
    }

    public int getPage() {
        if (page < 1) {
            return 1;
        } else {
            return page;
        }
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        if (pageSize < 1) {
            return DEFAULT_PAGE_SIZE;
        } else {
            return pageSize;
        }
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageOrderBy() {
        if (pageOrderBy == null) {
            return DEFAULT_ORDER_BY;
        } else {
            return pageOrderBy;
        }
    }

    public void setPageOrderBy(String pageOrderBy) {
        this.pageOrderBy = pageOrderBy;
    }

    public String getPageOrder() {
        if (pageOrder == null) {
            return DEFAULT_ORDER;
        } else {
            return pageOrder;
        }
    }

    public void setPageOrder(String pageOrder) {
        this.pageOrder = pageOrder;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalPages() {
        totalPages = (totalSize + getPageSize() - 1) / getPageSize();
        
        return totalPages;
    }

    public String getUrl() {
        return url + ".do?page";
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
