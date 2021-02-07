package com.ywh.shoppingoauth.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ywh.shoppingoauth.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/12/15
 */
public interface UserMapper extends BaseMapper<User> {

    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(@Param("list") List<User> list);

    int insertOrUpdate(User record);

    int insertOrUpdateSelective(User record);
}
