package com.manager.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceProductExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public FinanceProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountIsNull() {
            addCriterion("threshold_amount is null");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountIsNotNull() {
            addCriterion("threshold_amount is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountEqualTo(BigDecimal value) {
            addCriterion("threshold_amount =", value, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountNotEqualTo(BigDecimal value) {
            addCriterion("threshold_amount <>", value, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountGreaterThan(BigDecimal value) {
            addCriterion("threshold_amount >", value, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("threshold_amount >=", value, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountLessThan(BigDecimal value) {
            addCriterion("threshold_amount <", value, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("threshold_amount <=", value, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountIn(List<BigDecimal> values) {
            addCriterion("threshold_amount in", values, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountNotIn(List<BigDecimal> values) {
            addCriterion("threshold_amount not in", values, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("threshold_amount between", value1, value2, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andThresholdAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("threshold_amount not between", value1, value2, "thresholdAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountIsNull() {
            addCriterion("step_amount is null");
            return (Criteria) this;
        }

        public Criteria andStepAmountIsNotNull() {
            addCriterion("step_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStepAmountEqualTo(BigDecimal value) {
            addCriterion("step_amount =", value, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountNotEqualTo(BigDecimal value) {
            addCriterion("step_amount <>", value, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountGreaterThan(BigDecimal value) {
            addCriterion("step_amount >", value, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("step_amount >=", value, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountLessThan(BigDecimal value) {
            addCriterion("step_amount <", value, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("step_amount <=", value, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountIn(List<BigDecimal> values) {
            addCriterion("step_amount in", values, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountNotIn(List<BigDecimal> values) {
            addCriterion("step_amount not in", values, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("step_amount between", value1, value2, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andStepAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("step_amount not between", value1, value2, "stepAmount");
            return (Criteria) this;
        }

        public Criteria andLockTermIsNull() {
            addCriterion("lock_term is null");
            return (Criteria) this;
        }

        public Criteria andLockTermIsNotNull() {
            addCriterion("lock_term is not null");
            return (Criteria) this;
        }

        public Criteria andLockTermEqualTo(Integer value) {
            addCriterion("lock_term =", value, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermNotEqualTo(Integer value) {
            addCriterion("lock_term <>", value, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermGreaterThan(Integer value) {
            addCriterion("lock_term >", value, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_term >=", value, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermLessThan(Integer value) {
            addCriterion("lock_term <", value, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermLessThanOrEqualTo(Integer value) {
            addCriterion("lock_term <=", value, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermIn(List<Integer> values) {
            addCriterion("lock_term in", values, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermNotIn(List<Integer> values) {
            addCriterion("lock_term not in", values, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermBetween(Integer value1, Integer value2) {
            addCriterion("lock_term between", value1, value2, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andLockTermNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_term not between", value1, value2, "lockTerm");
            return (Criteria) this;
        }

        public Criteria andRewardRateIsNull() {
            addCriterion("reward_rate is null");
            return (Criteria) this;
        }

        public Criteria andRewardRateIsNotNull() {
            addCriterion("reward_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRewardRateEqualTo(BigDecimal value) {
            addCriterion("reward_rate =", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateNotEqualTo(BigDecimal value) {
            addCriterion("reward_rate <>", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateGreaterThan(BigDecimal value) {
            addCriterion("reward_rate >", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reward_rate >=", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateLessThan(BigDecimal value) {
            addCriterion("reward_rate <", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reward_rate <=", value, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateIn(List<BigDecimal> values) {
            addCriterion("reward_rate in", values, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateNotIn(List<BigDecimal> values) {
            addCriterion("reward_rate not in", values, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reward_rate between", value1, value2, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andRewardRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reward_rate not between", value1, value2, "rewardRate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table finance_product
     *
     * @mbg.generated do_not_delete_during_merge Mon Aug 12 20:53:12 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}