package com.finance.gateway;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.manager.model.BasePageResultBean;
import com.manager.model.bean.FinanceProductQueryBean;
import com.manager.model.bean.FinanceProductResultBean;

//服务提供端 注册给 JsonRpc
@JsonRpcService("/products")
public interface FinanceProductRpc {

    /**
     * 查询多个产品
     * @param queryBean
     * @return
     */
    public BasePageResultBean<FinanceProductResultBean> getProducts(FinanceProductQueryBean queryBean);

    /**
     * 查询单个产品
     * @param id
     * @return
     */
    public FinanceProductResultBean getOneFinanceProduct(Integer id);
}
