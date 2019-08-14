package com.manager.controller;

import com.manager.model.jpa.model.Product;
import com.manager.rservice.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产品管理 模块
 * @RestController   =  @ResponseBody + @Controller
 */
@Api(value = "金融产品管理ontroller",description = "",tags = "")
@RestController
@RequestMapping(value = "/rfinance")
public class ProductController {

    private  static Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    // restful 风格
    @RequestMapping(value = "/product",method = RequestMethod.POST)
    @ApiOperation(value = "添加产品",tags = "")
    public Product add(@RequestBody Product product) {
        logger.info("进入Controller，准备创建产品，参数:{}",product);
        Product p = productService.addProduct(product);
        logger.info("进入Controller,产品创建完成，最终产品为:{}",product);
        return p;
    }

    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public Product getOneProduct() {
        Product p = new Product();
        logger.info("进入Controller,产品创建完成，最终产品为:{}");
        return p;
    }
}
