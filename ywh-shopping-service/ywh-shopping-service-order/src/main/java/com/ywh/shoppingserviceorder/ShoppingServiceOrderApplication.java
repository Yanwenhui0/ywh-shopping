package com.ywh.shoppingserviceorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {
        "com.ywh.shoppingservicegoodsapi.feign",
        "com.ywh.shoppingserviceuserapi.feign"
})
@MapperScan(basePackages = "com.ywh.shoppingserviceorder.mapper")
public class ShoppingServiceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingServiceOrderApplication.class, args);
    }

}
