package com.xuren.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties
//@Component   运用此两个注解，可以更加简便，全部都用配置文件
//(但是考虑到此类修改次数并不多，添加新的内容也很容易，就没有更进一步扩展)
/**
 * swagger 配置信息
 */
public class SwaggerInfo {
    /**
     * 模块名(自定义)
     */
    private String moduleName ;

    /**
     * 要扫描的包名(controller所在的包名)
     */
    private String basePackage;

    /**
     * 指定只显示 哪个地址下的接口
     */
    private String antPath;

    private String title = "Finance System API SHOW";

    private String description = "Swagger 自动生成接口文档";

    private String license = "Apache License Version 2.0";

    public String getmoduleName() {
        return moduleName;
    }

    public void setmoduleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getAntPath() {
        return antPath;
    }

    public void setAntPath(String antPath) {
        this.antPath = antPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public SwaggerInfo(String moduleName, String basePackage) {
        this.moduleName = moduleName;
        this.basePackage = basePackage;
    }
}
