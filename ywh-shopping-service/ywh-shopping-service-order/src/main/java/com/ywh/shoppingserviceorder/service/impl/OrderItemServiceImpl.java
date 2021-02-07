package com.ywh.shoppingserviceorder.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingserviceorder.mapper.OrderItemMapper;
import com.ywh.shoppingserviceorderapi.pojo.OrderItem;
import com.ywh.shoppingserviceorder.service.OrderItemService;
/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService{

}
