package com.ywh.shoppingservicegoods.controller;

import com.ywh.shoppingservicegoods.service.CategoryService;
import com.ywh.shoppingservicegoodsapi.vo.CategoryTreeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/12/17
 */
@RestController
@RequestMapping("/category")
@Validated
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/tree")
    public List<CategoryTreeVo> getCategoryTree() {
        return categoryService.getCategoryTree();
    }

}
