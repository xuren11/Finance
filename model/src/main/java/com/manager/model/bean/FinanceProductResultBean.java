package com.manager.model.bean;

import com.manager.model.entity.FinanceProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("产品结果bean")
public class FinanceProductResultBean extends FinanceProduct {

    @ApiModelProperty("产品状态描述")
    private String statusDesc;

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    @Override
    public String toString() {
        return "FinanceProductResultBean{" +
                "statusDesc='" + statusDesc + '\'' +
                '}';
    }
}
