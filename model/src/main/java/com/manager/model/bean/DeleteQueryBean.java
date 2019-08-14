package com.manager.model.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 对于这中靠 ids集合删除的操作，直接用List<Integre>， 如果前端不进行一定的处理，后端是接收不了的
 * 最简单的就是 将ids封装Dao一个Bean里面去
 */
@ApiModel("id 删除bean")
public class DeleteQueryBean {

    @ApiModelProperty("要查询的产品id集合")
    private List<Integer>  ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
