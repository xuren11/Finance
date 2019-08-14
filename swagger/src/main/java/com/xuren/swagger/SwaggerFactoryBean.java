package com.xuren.swagger;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * swagger 配置类
 */
@Configuration
// @ComponentScan(basePackages = "com.xuren.swagger")
@EnableSwagger2
public class SwaggerFactoryBean {


    /**
     * SPringBoot默认已有的controller;例如BasicErrorController等  通常是被注释的
     * @return
     */
    @Bean
    public Docket defaultControllerApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        ApiSelectorBuilder builder = docket.select();
        builder = builder.apis(RequestHandlerSelectors.basePackage(BasicErrorController.class.getPackage().getName()));

        return builder.build();
    }

    /**
     * FinanceProduct端manager
     * @return
     */
    @Bean
    public Docket managerControllerApi() {
        SwaggerInfo info = new SwaggerInfo("product","com.manager.controller");
        return getDocket(info);
    }

    /**
     * sell 端
     * @return
     */
    @Bean
    public Docket sellControllerApi() {
        SwaggerInfo info = new SwaggerInfo("sell","com.sell.controller");
        return getDocket(info);
    }


    private static ApiInfo apiInfo(SwaggerInfo swaggerInfo) {
        return new ApiInfoBuilder()
                .title(swaggerInfo.getTitle())
                .description(swaggerInfo.getDescription())
                .termsOfServiceUrl("http://springfox.io")
                .license(swaggerInfo.getLicense())
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("2.0")
                .build();
    }

    private static Docket getDocket(SwaggerInfo swaggerInfo){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .groupName(swaggerInfo.getmoduleName())
                .apiInfo(apiInfo(swaggerInfo));
//                .paths(PathSelectors.ant(swaggerInfo.getAntPath()));  指定筛选只显示哪些
//                 示例：antPaht = "/hhh"  则只显示 /hhh 下的api接口
        ApiSelectorBuilder builder = docket.select();
        if (!StringUtils.isEmpty(swaggerInfo.getBasePackage())) {
            builder = builder.apis(RequestHandlerSelectors.basePackage(swaggerInfo.getBasePackage()));
        }
        if (!StringUtils.isEmpty(swaggerInfo.getAntPath())) {
            builder = builder.paths(PathSelectors.ant(swaggerInfo.getAntPath()));
        }

        return builder.build();
    }
}
