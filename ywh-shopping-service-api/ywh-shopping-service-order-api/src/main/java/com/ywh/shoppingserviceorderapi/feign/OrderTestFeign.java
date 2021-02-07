package com.ywh.shoppingserviceorderapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/11/30
 */
@FeignClient(value = "order", path = "/order")
@RequestMapping("/test")
public interface OrderTestFeign {

    @GetMapping("/{from}")
    String test(@PathVariable String from);

}

