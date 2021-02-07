package com.ywh.shoppingservicegoodsapi.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
/**
    * 商品类目
    */
@Data
@TableName(value = "tb_category")
public class Category implements Serializable {
    /**
     * 分类ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 商品数量
     */
    @TableField(value = "goods_num")
    private Integer goodsNum;

    /**
     * 是否显示
     */
    @TableField(value = "is_show")
    private String isShow;

    /**
     * 是否导航
     */
    @TableField(value = "is_menu")
    private String isMenu;

    /**
     * 排序
     */
    @TableField(value = "seq")
    private Integer seq;

    /**
     * 上级ID
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 模板ID
     */
    @TableField(value = "template_id")
    private Integer templateId;

    private static final long serialVersionUID = 1L;
}
