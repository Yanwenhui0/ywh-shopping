package com.ywh.shoppingoauth.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ywh.shoppingoauth.mapper.UserMapper;
import com.ywh.shoppingoauth.pojo.SecurityUserDetails;
import com.ywh.shoppingoauth.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/12/29
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectOne(new QueryWrapper<>(new User().setUsername(username)));
        return new SecurityUserDetails(user);
    }

}
