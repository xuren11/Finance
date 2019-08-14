package com.manager.rservice;

import com.manager.enums.ProductStatus;
import com.manager.global.exception.FinanceException;
import com.manager.model.jpa.model.Product;
import com.manager.repositories.ProductRepositoriy;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 产品管理Service
 */
@Service
public class ProductService {

    private static Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepositoriy repository;

    public Product  addProduct(Product product){
        logger.debug("创建产品，参数:{}",product);
        //数据规则校验
        checkProduct(product);
        //默认值设置
        setDefault(product);

       Product p = repository.save(product);
        logger.debug("产品创建完成，结果:{}",product);

        return p;

    }

//    public List<Product> getProduct(Product bean){
//        Example<Product> example = Example.of(bean);
//
//        repository.findAll(new Example<Product>(),)
//        return  null;
//    }

    /**
     * 产品默认值设置
     * @param product
     */
    private void setDefault(Product product) {
        if(null == product.getCreateTime()){
            product.setCreateTime(new Date());
        }
        if(null == product.getUpdateTime()){
            product.setUpdateTime(new Date());
        }
        if(null == product.getStepAmount()){
            product.setStepAmount(new BigDecimal(1000.00));
        }
        if(null == product.getLockTerm()){
            product.setLockTerm(30);
        }
        if(null == product.getStatus()){
            product.setStatus(ProductStatus.AUDITING.name());
        }
        if(null == product.getLockTerm()){
            product.setLockTerm(30);
        }
        //其他非空值等
    }

    /**
     * 金融产品 数据校验。要符合业务规则
     * 根据实际业务规则进行校验,一般是为空以及值得合法性的校验
     * 在次就不一一列举了
     * @param product
     */
    private void checkProduct(Product product) throws FinanceException {

        if(BigDecimal.ZERO.compareTo(product.getRewardRate())  > Integer.valueOf(1)){
            throw new FinanceException("利率必须要大于0");
        }
        if(StringUtils.isEmpty(product.getName())){
            throw  new FinanceException("产品名称不能为空！");
        }
    }

    /**
     * 查询单个产品
     *
     * @param id 产品编号
     * @return 返还对应产品或者null
     */
    public Product findOne(Integer id) throws FinanceException{
        if(null == id){
            throw  new FinanceException("查询id不可为空");
        }

        Product product = repository.findOne(id);

        logger.debug("查询单个产品,结果={}", product);

        return product;
    }

    /**
     * 分页查询产品
     *
     * @param idList
     * @param minRewardRate
     * @param maxRewardRate
     * @param statusList
     * @param pageable
     * @return
     */
    public Page<Product> query(List<Integer> idList,
                               BigDecimal minRewardRate, BigDecimal maxRewardRate,
                               List<String> statusList,
                               Pageable pageable) {

        logger.debug("查询产品,idList={},minRewardRate={},maxRewardRate={},statusList={},pageable={}", idList, minRewardRate, maxRewardRate, statusList, pageable);
        Specification<Product> specification = new Specification<Product>() {
            @Override
            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Expression<Integer> idCol = root.get("id");
                Expression<BigDecimal> rewardRateCol = root.get("rewardRate");
                Expression<String> statusCol = root.get("status");
                List<Predicate> predicates = new ArrayList<>();
                if (idList != null && idList.size() > 0) {
                    predicates.add(idCol.in(idList));
                }
                if (minRewardRate != null && BigDecimal.ZERO.compareTo(minRewardRate) < 0) {
                    predicates.add(cb.ge(rewardRateCol, minRewardRate));
                }
                if (maxRewardRate != null && BigDecimal.ZERO.compareTo(maxRewardRate) < 0) {
                    predicates.add(cb.le(rewardRateCol, maxRewardRate));
                }
                if (statusList != null && statusList.size() > 0) {
                    predicates.add(statusCol.in(statusList));
                }

                query.where(predicates.toArray(new Predicate[0]));
                return null;
            }
        };

        Page<Product> page = repository.findAll(specification, pageable);

        logger.debug("查询产品,结果={}", page);
        return page;
    }


}
