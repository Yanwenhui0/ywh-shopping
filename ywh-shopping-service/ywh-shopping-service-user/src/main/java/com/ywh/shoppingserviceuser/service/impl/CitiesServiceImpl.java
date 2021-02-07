package com.ywh.shoppingserviceuser.service.impl;

import com.ywh.shoppingserviceuser.service.CitiesService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingserviceuserapi.pojo.Cities;
import com.ywh.shoppingserviceuser.mapper.CitiesMapper;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class CitiesServiceImpl extends ServiceImpl<CitiesMapper, Cities> implements CitiesService {

}
