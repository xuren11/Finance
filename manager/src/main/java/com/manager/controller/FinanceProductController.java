package com.manager.controller;

import com.manager.model.BasePageResultBean;
import com.manager.model.bean.DeleteQueryBean;
import com.manager.model.bean.FinanceProductQueryBean;
import com.manager.model.bean.FinanceProductResultBean;
import com.manager.model.entity.FinanceProduct;
import com.manager.model.service.FinanceProductService;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "金融产品管理ontroller--mybatis",description = "",tags = "")
@RestController
@RequestMapping(value = "/dfinance")
public class FinanceProductController {

    @Autowired
    FinanceProductService service;

    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public FinanceProduct addProduct(FinanceProduct product){
        return service.addFinanceProduct(product);
    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public BasePageResultBean<FinanceProductResultBean>  getProducts(FinanceProductQueryBean queryBean){
        return service.getFinanceProducts(queryBean);
    }

    @RequestMapping(value = "/product",method = RequestMethod.PATCH)
    public FinanceProduct updateProduct(FinanceProduct product){
        //尽量不要在 此处(controller)做数据校验工作,显得代码臃肿。数据校验最好在 service层做
        return service.updateFinanceProduct(product);
    }

    @RequestMapping(value = "/products",method = RequestMethod.DELETE)
    public String deleteProducts(DeleteQueryBean bean){
        //尽量不要在 此处(controller)做数据校验工作,显得代码臃肿。数据校验最好在 service层做
        service.deleteFinanceProducts(bean);

        return "删除成功";
    }
}
