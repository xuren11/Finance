package com.manager.model.bean;

import com.manager.model.entity.FinanceProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ApiModel("产品信息查询Bean")
public class FinanceProductQueryBean extends FinanceProduct implements Serializable {

    private static final long serialVersionUID = -9137569387057048939L;

    @ApiModelProperty("要查询的产品id集合")
    private List<Integer>  ids;

    @ApiModelProperty("创建开始时间")
    private Date createTimeBegin;

    @ApiModelProperty("创建开始时间")
    private Date createTimeEnd;

    @ApiModelProperty("创建开始时间")
    private Date updateTimeBegin;

    @ApiModelProperty("创建结束时间")
    private Date updateTimeEnd;

    @ApiModelProperty("锁定期最短时间")
    private Integer lockTermMin;

    @ApiModelProperty("随定期最长时间")
    private Integer lockTermMax;

    @ApiModelProperty("产品起投金额最小值")
    private BigDecimal thresholdAmountMin;

    @ApiModelProperty("产品起投金额最大值")
    private BigDecimal thresholdAmountMax;

    @ApiModelProperty("产品投资步长最小值")
    private BigDecimal stepAmountMin;

    @ApiModelProperty("产品投资步长最大值")
    private BigDecimal stepAmountMax;

    @ApiModelProperty("产品收益率最小值")
    private BigDecimal rewardRateMin;

    @ApiModelProperty("产品收益率最大值")
    private BigDecimal rewardRateMax;
//
//    @ApiModelProperty("产品状态")
//    private String status;
//
//    @Override
//    public String getStatus() {
//        return status;
//    }
//
//    @Override
//    public void setStatus(String status) {
//        this.status = status;
//    }

    @ApiModelProperty("查询起始地址,默认第一页")
    private Integer pageNum = 1;

    @ApiModelProperty("每页展示数据的条数。默认10条")
    private Integer pageSize = 10;

    private  Integer startIndex;

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
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

    public Date getUpdateTimeBegin() {
        return updateTimeBegin;
    }

    public void setUpdateTimeBegin(Date updateTimeBegin) {
        this.updateTimeBegin = updateTimeBegin;
    }

    public Date getUpdateTimeEnd() {
        return updateTimeEnd;
    }

    public void setUpdateTimeEnd(Date updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getLockTermMin() {
        return lockTermMin;
    }

    public void setLockTermMin(Integer lockTermMin) {
        this.lockTermMin = lockTermMin;
    }

    public Integer getLockTermMax() {
        return lockTermMax;
    }

    public void setLockTermMax(Integer lockTermMax) {
        this.lockTermMax = lockTermMax;
    }

    public BigDecimal getThresholdAmountMin() {
        return thresholdAmountMin;
    }

    public void setThresholdAmountMin(BigDecimal thresholdAmountMin) {
        this.thresholdAmountMin = thresholdAmountMin;
    }

    public BigDecimal getThresholdAmountMax() {
        return thresholdAmountMax;
    }

    public void setThresholdAmountMax(BigDecimal thresholdAmountMax) {
        this.thresholdAmountMax = thresholdAmountMax;
    }

    public BigDecimal getStepAmountMin() {
        return stepAmountMin;
    }

    public void setStepAmountMin(BigDecimal stepAmountMin) {
        this.stepAmountMin = stepAmountMin;
    }

    public BigDecimal getStepAmountMax() {
        return stepAmountMax;
    }

    public void setStepAmountMax(BigDecimal stepAmountMax) {
        this.stepAmountMax = stepAmountMax;
    }

    public BigDecimal getRewardRateMin() {
        return rewardRateMin;
    }

    public void setRewardRateMin(BigDecimal rewardRateMin) {
        this.rewardRateMin = rewardRateMin;
    }

    public BigDecimal getRewardRateMax() {
        return rewardRateMax;
    }

    public void setRewardRateMax(BigDecimal rewardRateMax) {
        this.rewardRateMax = rewardRateMax;
    }
}
