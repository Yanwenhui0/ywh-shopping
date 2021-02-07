package com.ywh.shoppingservicegoodsapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/11/30
 */
@FeignClient(value = "goods", path = "/goods")
@RequestMapping("/test")
public interface GoodsTestFeign {

    @GetMapping("/{from}")
    String test(@PathVariable String from);

}
