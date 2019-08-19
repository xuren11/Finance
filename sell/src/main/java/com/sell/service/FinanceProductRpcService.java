package com.sell.service;

import com.finance.gateway.FinanceProductRpc;
import com.manager.model.BasePageResultBean;
import com.manager.model.bean.FinanceProductQueryBean;
import com.manager.model.bean.FinanceProductResultBean;
import com.manager.model.entity.FinanceProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class FinanceProductRpcService {

    private  static Logger logger = LoggerFactory.getLogger(FinanceProductRpcService.class);

    @Autowired
    FinanceProductRpc productRpc;

    /**
     * 查询全部产品
     */
    public BasePageResultBean<FinanceProductResultBean> findAll(FinanceProductQueryBean queryBean) {

        //此处没有做更细化的定制需求(如果有业务需求要定制化 查询， 定制化再写一遍查询逻辑即可)
        return productRpc.getProducts(queryBean);
    }

    @PostConstruct  //该注解的特性，完全可以用来作为 单元测试(测 service 以及 dao层)
    public void test() {
            FinanceProductQueryBean queryBean= new FinanceProductQueryBean();
            queryBean.setId(8);
            BasePageResultBean<FinanceProductResultBean> resultBeanBasePageResultBean = findAll(queryBean);
        logger.info("查询结果为: {}",resultBeanBasePageResultBean);

    }

    /**
     * 获取单个产品信息
     * @param id
     * @return
     */
    public FinanceProductResultBean getOneProduct(Integer id){
        logger.info("进入单个产品查询！");
        return productRpc.getOneFinanceProduct(id);
    }

//    @PostConstruct
//    public void init(){
//        getOneProduct(9);
//
//    }
}
