package com.ywh.shoppingservicegoods.controller;

import com.ywh.shoppingserviceorderapi.feign.OrderTestFeign;
import com.ywh.shoppingserviceuserapi.feign.UserTestFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/11/6
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final OrderTestFeign orderTestFeign;

    private final UserTestFeign userTestFeign;

    @GetMapping("/{from}")
    public String test(@PathVariable String from) {
        String str = "hello world goods" + from;
        str = str + "\n" + orderTestFeign.test(from);
        str = str + "\n" + userTestFeign.test(from);
        return str;
    }

}
