package com.ywh.shoppingserviceorder.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingserviceorder.mapper.OrderLogMapper;
import com.ywh.shoppingserviceorderapi.pojo.OrderLog;
import com.ywh.shoppingserviceorder.service.OrderLogService;
/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class OrderLogServiceImpl extends ServiceImpl<OrderLogMapper, OrderLog> implements OrderLogService{

}
