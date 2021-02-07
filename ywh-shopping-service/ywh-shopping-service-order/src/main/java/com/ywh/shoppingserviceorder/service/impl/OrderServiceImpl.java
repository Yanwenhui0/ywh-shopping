package com.ywh.shoppingserviceorder.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingserviceorder.mapper.OrderMapper;
import com.ywh.shoppingserviceorderapi.pojo.Order;
import com.ywh.shoppingserviceorder.service.OrderService;
/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService{

}
