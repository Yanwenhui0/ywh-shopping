package com.ywh.shoppingserviceorderapi.pojo;

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
@Data
@TableName(value = "tb_order_item")
public class OrderItem implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 1级分类
     */
    @TableField(value = "category_id1")
    private Integer categoryId1;

    /**
     * 2级分类
     */
    @TableField(value = "category_id2")
    private Integer categoryId2;

    /**
     * 3级分类
     */
    @TableField(value = "category_id3")
    private Integer categoryId3;

    /**
     * SPU_ID
     */
    @TableField(value = "spu_id")
    private String spuId;

    /**
     * SKU_ID
     */
    @TableField(value = "sku_id")
    private String skuId;

    /**
     * 订单ID
     */
    @TableField(value = "order_id")
    private String orderId;

    /**
     * 商品名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 单价
     */
    @TableField(value = "price")
    private Integer price;

    /**
     * 数量
     */
    @TableField(value = "num")
    private Integer num;

    /**
     * 总金额
     */
    @TableField(value = "money")
    private Integer money;

    /**
     * 实付金额
     */
    @TableField(value = "pay_money")
    private Integer payMoney;

    /**
     * 图片地址
     */
    @TableField(value = "image")
    private String image;

    /**
     * 重量
     */
    @TableField(value = "weight")
    private Integer weight;

    /**
     * 运费
     */
    @TableField(value = "post_fee")
    private Integer postFee;

    /**
     * 是否退货
     */
    @TableField(value = "is_return")
    private Integer isReturn;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "is_del")
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}
