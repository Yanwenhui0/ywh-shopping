package com.ywh.shoppinggatewayweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShoppingGatewayWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingGatewayWebApplication.class, args);
    }

}
