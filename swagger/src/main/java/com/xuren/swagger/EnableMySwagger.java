package com.xuren.swagger;

import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 只是一个简单的组合注解
 * 注解在 启动类上
 */
@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = { java.lang.annotation.ElementType.TYPE })
@Documented
@Import(SwaggerFactoryBean.class)
@EnableSwagger2
public @interface EnableMySwagger {
}
