package com.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//com.manager.model.mapper
//@EnableMySwagger
@SpringBootApplication
//扫描 dao层类
@MapperScan("com.manager.model.dao")
public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class);
    }

}
