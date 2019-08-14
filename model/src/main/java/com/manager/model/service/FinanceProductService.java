package com.manager.model.service;

import com.manager.enums.ProductStatus;
import com.manager.global.exception.FinanceException;
import com.manager.model.BasePageResultBean;
import com.manager.model.bean.DeleteQueryBean;
import com.manager.model.bean.FinanceProductQueryBean;
import com.manager.model.bean.FinanceProductResultBean;
import com.manager.model.dao.FinanceProductDao;
import com.manager.model.entity.FinanceProduct;
import com.manager.model.mapper.FinanceProductMapper;
import org.apache.commons.lang3.StringUtils;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class FinanceProductService {

    private Logger logger = LoggerFactory.getLogger(FinanceProductService.class);

    @Autowired
    FinanceProductDao financeProductDao;

//    @Autowired
//    FinanceProductMapper financeProductMapper;


    public FinanceProduct addFinanceProduct(FinanceProduct p) {

        System.out.println("financeProductDao的值为" + financeProductDao.toString());
        checkProduct(p);
        setDefault(p);
        p.setId(financeProductDao.insertProduct(p));
        return p;
    }

    /**
     * 产品默认值设置
     *
     * @param product
     */
    private void setDefault(FinanceProduct product) {
        if (null == product.getCreateTime()) {
            product.setCreateTime(new Date());
        }
        if (null == product.getUpdateTime()) {
            product.setUpdateTime(new Date());
        }
        if (null == product.getStepAmount()) {
            product.setStepAmount(new BigDecimal(1000.00));
        }
        if (null == product.getLockTerm()) {
            product.setLockTerm(30);
        }
        if (null == product.getStatus()) {
            product.setStatus(ProductStatus.AUDITING.name());
        }
        if (null == product.getLockTerm()) {
            product.setLockTerm(30);
        }
        //其他非空值等
    }

    /**
     * 金融产品 数据校验。要符合业务规则
     * 根据实际业务规则进行校验,一般是为空以及值得合法性的校验
     * 在次就不一一列举了
     *
     * @param product
     */
    private void checkProduct(FinanceProduct product) throws FinanceException {

        if (BigDecimal.ZERO.compareTo(product.getRewardRate()) > 0) {
            throw new FinanceException("利率必须要大于0");
        }
        if (StringUtils.isEmpty(product.getName())) {
            throw new FinanceException("产品名称不能为空！");
        }
    }

    public BasePageResultBean<FinanceProductResultBean> getFinanceProducts(FinanceProductQueryBean query) {
        List<FinanceProductResultBean> list;
        logger.info("分页参数为:{}", query.getPageSize());
        query.setStartIndex((query.getPageNum() - 1) * query.getPageSize());
        //随便修改一下
        //使用分页插件 进行分页   插件使用失败。。。。有空再来修正  可能是依赖的版本不对
//        PageHelper.offsetPage(query.getPageNum(),query.getPageSize(),true);

//        logger.info("startIndex的值为:{}",query.getStartIndex());
        list = financeProductDao.selectFinanceProduct(query);
//        list = PageHelper.startPage(1, 10).doSelectPage(()-> financeProductDao.selectFinanceProduct(query));
        if (null != list && !list.isEmpty()) {
            for (FinanceProductResultBean bean : list) {
                if (StringUtils.isNotBlank(bean.getStatus())) {
                    bean.setStatusDesc(ProductStatus.getDescByCode(bean.getStatus()));
                }
            }
        }
        BasePageResultBean<FinanceProductResultBean> pageResultBean = new BasePageResultBean<>();
        pageResultBean.setResult(list);
        pageResultBean.setTotalNum(financeProductDao.countRecordNum(query));
        pageResultBean.setPageNum(query.getPageNum());
        pageResultBean.setEveryPageRecordNum(query.getPageSize());
        return pageResultBean;
    }

    public Integer getTotalRecordNums(FinanceProductQueryBean queryBean) {
        return financeProductDao.countRecordNum(queryBean);
    }

    public FinanceProduct updateFinanceProduct(FinanceProduct product) {
        if (null == product.getId()) {
            throw new FinanceException("参数传递错误！更新请传入产品id！");
        }
        financeProductDao.updateProduct(product);
        return financeProductDao.selectOneProduct(product.getId());
    }

    public void deleteFinanceProducts(DeleteQueryBean deleteQueryBean) {
        if(null == deleteQueryBean  || deleteQueryBean.getIds().isEmpty()){
            throw new FinanceException("参数传递错误！ 删除请传入产品id集合！");
        }
        financeProductDao.deleteProducts(deleteQueryBean);
    }


}
