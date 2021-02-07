package com.ywh.shoppingserviceseckillapi.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/2/7
 */
@Data
@TableName(value = "tb_seckill_goods")
public class SeckillGoods implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * spu ID
     */
    @TableField(value = "goods_id")
    private Long goodsId;

    /**
     * sku ID
     */
    @TableField(value = "item_id")
    private Long itemId;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 商品图片
     */
    @TableField(value = "small_pic")
    private String smallPic;

    /**
     * 原价格
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 秒杀价格
     */
    @TableField(value = "cost_price")
    private BigDecimal costPrice;

    /**
     * 商家ID
     */
    @TableField(value = "seller_id")
    private String sellerId;

    /**
     * 添加日期
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 审核日期
     */
    @TableField(value = "check_time")
    private Date checkTime;

    /**
     * 审核状态，0未审核，1审核通过，2审核不通过
     */
    @TableField(value = "`status`")
    private String status;

    /**
     * 开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 秒杀商品数
     */
    @TableField(value = "num")
    private Integer num;

    /**
     * 剩余库存数
     */
    @TableField(value = "stock_count")
    private Integer stockCount;

    /**
     * 描述
     */
    @TableField(value = "introduction")
    private String introduction;

    private static final long serialVersionUID = 1L;
}
