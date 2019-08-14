package com.manager.enums;

import java.util.Objects;

/**
 * 产品状态
 */
public enum ProductStatus {
    AUDITING("审核中"),

    IN_SELL("销售中"),

    LOCKED("暂停销售"),

    FINISHED("已结束");

    private String desc;

    ProductStatus(String desc){

        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getCode() {
        return this.name();
    }

    public static String getDescByCode(String code) {
        for (ProductStatus productStatus : ProductStatus.values()) {
            if (Objects.equals(code, productStatus.getCode())) {
                return productStatus.getDesc();
            }
        }
        return null;
    }
}
