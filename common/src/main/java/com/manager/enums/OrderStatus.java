package com.manager.enums;

import java.util.Objects;

/**
 * 订单状态
 */
public enum OrderStatus {
    INIT("初始化"),
    PROCESS("处理中"),
    SUCCESS("成功"),
    FAIL("失败");

    private String desc;

    OrderStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return this.name();
    }

    public static String getDescByCode(String code) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (Objects.equals(code, orderStatus.getCode())) {
                return orderStatus.getDesc();
            }
        }
        return null;
    }
}
