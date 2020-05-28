package com.ross.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、将服务提供者注册到注册中心
 *      (1)引入dubbo和zookeeper相关依赖
 *      (2)配置dubbo的相关信息
 *      (3)使用@Service发布服务
 *
 *
 */
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}
