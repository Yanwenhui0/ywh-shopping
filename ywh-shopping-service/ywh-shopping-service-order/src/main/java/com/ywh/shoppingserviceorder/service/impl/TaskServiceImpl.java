package com.ywh.shoppingserviceorder.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingserviceorderapi.pojo.Task;
import com.ywh.shoppingserviceorder.mapper.TaskMapper;
import com.ywh.shoppingserviceorder.service.TaskService;
/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements TaskService{

}
