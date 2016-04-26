package com.activelife.common.constant;

public class CommonEnum {
    /**
     * 产品图片类型(用途)
     */
    public static enum IMAGE_TYPE {
        COMPUTER_HOME_PAGE("电脑-首页图片"), COMPUTER_DETAIL_PAGE("电脑-详情页图片"), PHONE_HOME_PAGE("手机-首页图片"), PHONE_DETAIL_PAGE(
                "手机-详情页图片");

        private String cnName;

        public static String getCnName(String code) {
            for (IMAGE_TYPE item : IMAGE_TYPE.values()) {
                if (item.getCode().equals(code)) {
                    return item.getCnName();
                }
            }

            return code;
        }

        IMAGE_TYPE(String name) {
            this.cnName = name;
        }

        public String getCode() {
            return this.name();
        }

        public String getCnName() {
            return this.cnName;
        }

        public String toString() {
            return this.name();
        }
    }

    /**
     * 产品审核状态
     */
    public static enum PRODUCT_STATUS {
        AUDITED_APPROVED("审核通过"), AUDITED_REJECTED("审核未通过"), UNAUDITED("未审核");

        private String cnName;

        public static String getCnName(String code) {
            for (PRODUCT_STATUS item : PRODUCT_STATUS.values()) {
                if (item.getCode().equals(code)) {
                    return item.getCnName();
                }
            }

            return code;
        }

        PRODUCT_STATUS(String name) {
            this.cnName = name;
        }

        public String getCode() {
            return this.name();
        }

        public String getCnName() {
            return this.cnName;
        }

        public String toString() {
            return this.name();
        }
    }

    /**
     * 订单状态
     */
    public static enum ORDER_STATUS {
        CANCEL("取消"), SEND("已发货"), SEND_BACK("退货"), FINISH("完成");

        private String cnName;

        public static String getCnName(String code) {
            for (ORDER_STATUS item : ORDER_STATUS.values()) {
                if (item.getCode().equals(code)) {
                    return item.getCnName();
                }
            }

            return code;
        }

        ORDER_STATUS(String name) {
            this.cnName = name;
        }

        public String getCode() {
            return this.name();
        }

        public String getCnName() {
            return this.cnName;
        }

        public String toString() {
            return this.name();
        }
    }

    /**
     * 订单支付状态
     */
    public static enum PAYMENT_STATUS {
        PAIED("已付款"), UNPAIED("未付款"), CASH_ON_DELIVERY("货到付款");

        private String cnName;

        public static String getCnName(String code) {
            for (PAYMENT_STATUS item : PAYMENT_STATUS.values()) {
                if (item.getCode().equals(code)) {
                    return item.getCnName();
                }
            }

            return code;
        }

        PAYMENT_STATUS(String name) {
            this.cnName = name;
        }

        public String getCode() {
            return this.name();
        }

        public String getCnName() {
            return this.cnName;
        }

        public String toString() {
            return this.name();
        }
    }
    /**
     * 用户状态
     */
    public static enum CUSTOMER_STATUS {
        C("正常"), D("删除"), F("冻结");

        private String cnName;

        public static String getCnName(String code) {
            for (CUSTOMER_STATUS item : CUSTOMER_STATUS.values()) {
                if (item.getCode().equals(code)) {
                    return item.getCnName();
                }
            }

            return code;
        }

        CUSTOMER_STATUS(String name) {
            this.cnName = name;
        }

        public String getCode() {
            return this.name();
        }

        public String getCnName() {
            return this.cnName;
        }

        public String toString() {
            return this.name();
        }
    }
}
