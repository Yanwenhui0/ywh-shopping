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
@Data
@TableName(value = "tb_spu")
public class Spu implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 货号
     */
    @TableField(value = "sn")
    private String sn;

    /**
     * SPU名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 副标题
     */
    @TableField(value = "caption")
    private String caption;

    /**
     * 品牌ID
     */
    @TableField(value = "brand_id")
    private Integer brandId;

    /**
     * 一级分类
     */
    @TableField(value = "category1_id")
    private Integer category1Id;

    /**
     * 二级分类
     */
    @TableField(value = "category2_id")
    private Integer category2Id;

    /**
     * 三级分类
     */
    @TableField(value = "category3_id")
    private Integer category3Id;

    /**
     * 模板ID
     */
    @TableField(value = "template_id")
    private Integer templateId;

    /**
     * 运费模板id
     */
    @TableField(value = "freight_id")
    private Integer freightId;

    /**
     * 图片
     */
    @TableField(value = "image")
    private String image;

    /**
     * 图片列表
     */
    @TableField(value = "images")
    private String images;

    /**
     * 售后服务
     */
    @TableField(value = "sale_service")
    private String saleService;

    /**
     * 介绍
     */
    @TableField(value = "introduction")
    private String introduction;

    /**
     * 规格列表
     */
    @TableField(value = "spec_items")
    private String specItems;

    /**
     * 参数列表
     */
    @TableField(value = "para_items")
    private String paraItems;

    /**
     * 销量
     */
    @TableField(value = "sale_num")
    private Integer saleNum;

    /**
     * 评论数
     */
    @TableField(value = "comment_num")
    private Integer commentNum;

    /**
     * 是否上架
     */
    @TableField(value = "is_marketable")
    private String isMarketable;

    /**
     * 是否启用规格
     */
    @TableField(value = "is_enable_spec")
    private String isEnableSpec;

    /**
     * 是否删除
     */
    @TableField(value = "is_delete")
    private String isDelete;

    /**
     * 审核状态
     */
    @TableField(value = "`status`")
    private String status;

    private static final long serialVersionUID = 1L;
}
