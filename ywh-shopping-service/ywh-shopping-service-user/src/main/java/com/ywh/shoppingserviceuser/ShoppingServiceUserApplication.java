package com.ywh.shoppingserviceuser;

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
        "com.ywh.shoppingserviceorderapi.feign"
})
@MapperScan(basePackages = "com.ywh.shoppingserviceuser.mapper")
public class ShoppingServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingServiceUserApplication.class, args);
    }

}
