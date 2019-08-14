package com.manager.enums;

import java.util.Objects;

/**
 * 订单类型
 */
public enum OrderType {
    APPLY("申购"),
    REDEEM("赎回");

    private String desc;

    OrderType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return this.name();
    }

    public static String getDescByCode(String code) {
        for (OrderType orderType : OrderType.values()) {
            if (Objects.equals(code, orderType.getCode())) {
                return orderType.getDesc();
            }
        }
        return null;
    }
}
