package com.activelife.common.product.po;

import com.activelife.common.base.po.BaseEntity;

/**
 * 产品图片
 * 
 * @author zhangpanfeng
 * 
 */
public class ProductImage extends BaseEntity {
    private static final long serialVersionUID = 2204500122496973L;

    /**
     * 图片ID
     */
    private String imageId;
    /**
     * 产品ID
     */
    private String productId;
    /**
     * 图片类型，用途
     */
    private String imageType;
    /**
     * 图片路径
     */
    private String imageUrl;
    /**
     * 是否有效（Y：有效 N：无效）
     */
    private String status;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
