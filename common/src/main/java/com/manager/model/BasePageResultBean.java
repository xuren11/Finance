package com.manager.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel("查询结果基础Bean")
public class BasePageResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1453977004052579670L;

    @ApiModelProperty("查询结果")
    private List<T> result;

    @ApiModelProperty("查询结果总条数")
    private Integer totalNum;

    @ApiModelProperty("当前页，默认为1")
    private Integer pageNum = 1;

    @ApiModelProperty("每页记录条数：默认为10")
    private Integer everyPageRecordNum = 10;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getEveryPageRecordNum() {
        return everyPageRecordNum;
    }

    public void setEveryPageRecordNum(Integer everyPageRecordNum) {
        this.everyPageRecordNum = everyPageRecordNum;
    }
}
