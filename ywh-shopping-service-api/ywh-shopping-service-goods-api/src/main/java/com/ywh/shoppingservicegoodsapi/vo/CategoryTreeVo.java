package com.ywh.shoppingservicegoodsapi.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ywh.shoppingcommoncore.dto.TreeNode;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/12/18
 */
@Data
@Accessors(chain = true)
public class CategoryTreeVo extends TreeNode<Integer, CategoryTreeVo> {

//    /**
//     * 分类ID
//     */
//    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 是否显示
     */
    private String isShow;

    /**
     * 是否导航
     */
    private String isMenu;

    /**
     * 排序
     */
    private Integer seq;

//    /**
//     * 上级ID
//     */
//    private Integer parentId;

    /**
     * 模板ID
     */
    private Integer templateId;

//    private List<CategoryTreeVo> categoryTreeVoList;

}
