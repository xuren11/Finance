package com.sell.controller;

import com.manager.global.exception.FinanceException;
import com.manager.model.jpa.model.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("销售controller")
@RestController
@RequestMapping("/sell")
public class SelleController {


    @ApiOperation("获取可销售的产品")
    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public Product get(){

        throw new FinanceException("HHHHH");
    }

}
