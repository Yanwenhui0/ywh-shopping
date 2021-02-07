package com.ywh.shoppingserviceuser.service.impl;

import com.ywh.shoppingserviceuser.service.AddressService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingserviceuserapi.pojo.Address;
import com.ywh.shoppingserviceuser.mapper.AddressMapper;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

}
