package com.ywh.shoppingservicegoods.service;

import com.ywh.shoppingservicegoodsapi.pojo.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ywh.shoppingservicegoodsapi.vo.CategoryTreeVo;

import java.util.List;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
public interface CategoryService extends IService<Category>{

    List<CategoryTreeVo> getCategoryTree();
}
