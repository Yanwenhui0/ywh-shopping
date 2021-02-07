package com.ywh.shoppingservicegoods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(
        basePackages = {
                "com.ywh.shoppingserviceorderapi.feign",
                "com.ywh.shoppingserviceuserapi.feign"
        })
@MapperScan(basePackages = "com.ywh.shoppingservicegoods.mapper")
public class ShoppingServiceGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingServiceGoodsApplication.class, args);
    }

}
