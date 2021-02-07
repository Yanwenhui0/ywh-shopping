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
    * 品牌表
    */
@Data
@TableName(value = "tb_brand")
public class Brand implements Serializable {
    /**
     * 品牌id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 品牌名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 品牌图片地址
     */
    @TableField(value = "image")
    private String image;

    /**
     * 品牌的首字母
     */
    @TableField(value = "letter")
    private String letter;

    /**
     * 排序
     */
    @TableField(value = "seq")
    private Integer seq;

    private static final long serialVersionUID = 1L;
}
