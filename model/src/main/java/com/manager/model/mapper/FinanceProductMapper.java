package com.manager.model.mapper;

import com.manager.model.entity.FinanceProduct;
import com.manager.model.entity.FinanceProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    long countByExample(FinanceProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    int deleteByExample(FinanceProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    int insert(FinanceProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    int insertSelective(FinanceProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    List<FinanceProduct> selectByExample(FinanceProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    FinanceProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") FinanceProduct record, @Param("example") FinanceProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    int updateByExample(@Param("record") FinanceProduct record, @Param("example") FinanceProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    int updateByPrimaryKeySelective(FinanceProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_product
     *
     * @mbg.generated Mon Aug 12 20:53:12 CST 2019
     */
    int updateByPrimaryKey(FinanceProduct record);
}