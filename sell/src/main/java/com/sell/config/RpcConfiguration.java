package com.sell.config;

import com.finance.gateway.FinanceProductRpc;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * rpc消费端 服务配置
 */
@Configuration
public class RpcConfiguration {

    private static Logger logger = LoggerFactory.getLogger(RpcConfiguration.class);

    @Bean
    public AutoJsonRpcClientProxyCreator rpcClientProxyCreator(@Value("${rpc.manager.url}") String url) {
        AutoJsonRpcClientProxyCreator creator = new AutoJsonRpcClientProxyCreator();
        //配置地址
        try {
            creator.setBaseUrl(new URL(url));
        } catch (MalformedURLException e) {
            logger.info("rpc服务创建失败！");
        }
        //扫描哪些类
        creator.setScanPackage(FinanceProductRpc.class.getPackage().getName()); //Scanning 'classpath:com/finance/gateway/**/*.class' for JSON-RPC service interfaces.
        return creator;
    }
}
