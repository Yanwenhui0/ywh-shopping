package com.ywh.shoppingserviceuser.controller;

import com.ywh.shoppingservicegoodsapi.feign.GoodsTestFeign;
import com.ywh.shoppingserviceorderapi.feign.OrderTestFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/11/30
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final GoodsTestFeign goodsTestFeign;

    private final OrderTestFeign orderTestFeign;

    @GetMapping("/{from}")
    public String test(@PathVariable String from) {
        String str = "hello world user" + from;
//        str = str + "\n" + goodsTestFeign.test(from);
//        str = str + "\n" + orderTestFeign.test(from);
        return str;
    }

}
