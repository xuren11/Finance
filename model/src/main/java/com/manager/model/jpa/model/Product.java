package com.manager.model.jpa.model;

import io.swagger.annotations.ApiModel;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品
 */
@Entity
@ApiModel("金融产品Bean")
@Table(name = "finance_product")
public class Product implements Serializable{
    @Id
    private Integer id;

    private String name;
    /**
     * @see com.manager.enums.ProductStatus
     */
    @ApiModelProperty(value = "状态",dataType = "xuren.enums.ProductStatus")
    private String status ;
    //起投金额
    private BigDecimal thresholdAmount ;
    //投资步长
    private BigDecimal stepAmount;
    //锁定期
    private Integer lockTerm;
    //收益率，因为要与其他数相乘，所以使用BigDecimal
    private BigDecimal rewardRate;
    private String memo;
    private Date createTime;
    private Date updateTime;
    private String createUser;
    private String updateUser;

    public Product(){}

    public Product(Integer id, String name, String status, BigDecimal thresholdAmount, BigDecimal stepAmount, BigDecimal rewardRate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.thresholdAmount = thresholdAmount;
        this.stepAmount = stepAmount;
        this.rewardRate = rewardRate;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getThresholdAmount() {
        return thresholdAmount;
    }

    public void setThresholdAmount(BigDecimal thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    public BigDecimal getStepAmount() {
        return stepAmount;
    }

    public void setStepAmount(BigDecimal stepAmount) {
        this.stepAmount = stepAmount;
    }

    public Integer getLockTerm() {
        return lockTerm;
    }

    public void setLockTerm(Integer lockTerm) {
        this.lockTerm = lockTerm;
    }

    public BigDecimal getRewardRate() {
        return rewardRate;
    }

    public void setRewardRate(BigDecimal rewardRate) {
        this.rewardRate = rewardRate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}
