package com.sell.controller;

import com.manager.enums.ProductStatus;
import com.manager.model.BasePageResultBean;
import com.manager.model.bean.FinanceProductQueryBean;
import com.manager.model.bean.FinanceProductResultBean;
import com.sell.service.FinanceProductRpcService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("销售controller")
@RestController
@RequestMapping("/sell")
public class SelleController {

    @Autowired
    FinanceProductRpcService productRpcService;

    @ApiOperation("获取可销售的产品")
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public BasePageResultBean<FinanceProductResultBean> getAllProducts(FinanceProductQueryBean queryBean) {
        //智能查询处于 销售中 状态的产品
        queryBean.setStatus(ProductStatus.IN_SELL.getCode());
       return  productRpcService.findAll(queryBean);
    }

    @ApiOperation("获取可销售的产品")
    @ApiImplicitParam(name = "id", value = "产品id", required = true, dataType = "Integer", paramType = "query")
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public FinanceProductResultBean getOneProducts(Integer id) {
        return  productRpcService.getOneProduct(id);
    }

}
