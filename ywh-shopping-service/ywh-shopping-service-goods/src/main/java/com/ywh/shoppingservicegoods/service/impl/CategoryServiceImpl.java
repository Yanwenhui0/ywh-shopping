package com.ywh.shoppingservicegoods.service.impl;

import com.ywh.shoppingcommoncore.util.TreeUtils;
import com.ywh.shoppingservicegoodsapi.vo.CategoryTreeVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywh.shoppingservicegoodsapi.pojo.Category;
import com.ywh.shoppingservicegoods.mapper.CategoryMapper;
import com.ywh.shoppingservicegoods.service.CategoryService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService{

    @Override
    public List<CategoryTreeVo> getCategoryTree() {
        List<Category> categoryList = baseMapper.selectList(null);
        return TreeUtils.buildTree(categoryList.stream().map(category -> {
            CategoryTreeVo categoryTreeVo = new CategoryTreeVo();
            BeanUtils.copyProperties(category, categoryTreeVo);
            return categoryTreeVo;
        }).collect(Collectors.toList()));
    }

}
