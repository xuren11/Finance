package com.manager.rpc;

import com.finance.gateway.FinanceProductRpc;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import com.manager.model.BasePageResultBean;
import com.manager.model.bean.FinanceProductQueryBean;
import com.manager.model.bean.FinanceProductResultBean;
import com.manager.model.entity.FinanceProduct;
import com.manager.model.service.FinanceProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * rpc 实现类
 */
@AutoJsonRpcServiceImpl  //rpc 服务类注解
@Service  //要交给Spring管理 所以还要使用下Spring的注解
public class FinanceProductRpcImpl implements FinanceProductRpc {

    private static Logger logger = LoggerFactory.getLogger(FinanceProductRpcImpl.class);

    @Autowired
    FinanceProductService financeProductService;

    @Override
    public BasePageResultBean<FinanceProductResultBean> getProducts(FinanceProductQueryBean queryBean) {
        logger.info("请求参数为：{}",queryBean);
        BasePageResultBean<FinanceProductResultBean> resultBean = null;
        resultBean =  financeProductService.getFinanceProducts(queryBean);
        logger.info("查询结果为：{}",resultBean);
        return resultBean;
    }

    @Override
    public FinanceProductResultBean getOneFinanceProduct(Integer id) {
        logger.info("请求参数为：{}",id);
        return financeProductService.getOneFinanceProduct(id);
    }

}
