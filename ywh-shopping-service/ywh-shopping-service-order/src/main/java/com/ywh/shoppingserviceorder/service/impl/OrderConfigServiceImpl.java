package com.ywh.shoppingserviceorder.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingserviceorderapi.pojo.OrderConfig;
import com.ywh.shoppingserviceorder.mapper.OrderConfigMapper;
import com.ywh.shoppingserviceorder.service.OrderConfigService;
/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class OrderConfigServiceImpl extends ServiceImpl<OrderConfigMapper, OrderConfig> implements OrderConfigService{

}
