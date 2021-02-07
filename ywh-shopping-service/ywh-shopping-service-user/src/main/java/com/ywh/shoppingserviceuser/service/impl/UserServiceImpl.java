package com.ywh.shoppingserviceuser.service.impl;

import com.ywh.shoppingserviceuser.service.UserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingserviceuserapi.pojo.User;
import com.ywh.shoppingserviceuser.mapper.UserMapper;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
