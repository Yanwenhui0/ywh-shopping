package com.ywh.shoppingservicegoodsapi.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
/**
    * 商品表
    */
@Data
@TableName(value = "tb_sku")
public class Sku implements Serializable {
    /**
     * 商品id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 商品条码
     */
    @TableField(value = "sn")
    private String sn;

    /**
     * SKU名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 价格（分）
     */
    @TableField(value = "price")
    private Integer price;

    /**
     * 库存数量
     */
    @TableField(value = "num")
    private Integer num;

    /**
     * 库存预警数量
     */
    @TableField(value = "alert_num")
    private Integer alertNum;

    /**
     * 商品图片
     */
    @TableField(value = "image")
    private String image;

    /**
     * 商品图片列表
     */
    @TableField(value = "images")
    private String images;

    /**
     * 重量（克）
     */
    @TableField(value = "weight")
    private Integer weight;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * SPUID
     */
    @TableField(value = "spu_id")
    private String spuId;

    /**
     * 类目ID
     */
    @TableField(value = "category_id")
    private Integer categoryId;

    /**
     * 类目名称
     */
    @TableField(value = "category_name")
    private String categoryName;

    /**
     * 品牌名称
     */
    @TableField(value = "brand_name")
    private String brandName;

    /**
     * 规格
     */
    @TableField(value = "spec")
    private String spec;

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
     * 商品状态 1-正常，2-下架，3-删除
     */
    @TableField(value = "`status`")
    private String status;

    @TableField(value = "version")
    private Integer version;

    private static final long serialVersionUID = 1L;
}
