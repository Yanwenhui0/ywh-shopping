package com.ywh.shoppingoauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ywh.shoppingoauth.mapper")
public class ShoppingOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingOauthApplication.class, args);
    }

}
