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
@TableName(value = "tb_order_config")
public class OrderConfig implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 正常订单超时时间（分）
     */
    @TableField(value = "order_timeout")
    private Integer orderTimeout;

    /**
     * 秒杀订单超时时间（分）
     */
    @TableField(value = "seckill_timeout")
    private Integer seckillTimeout;

    /**
     * 自动收货（天）
     */
    @TableField(value = "take_timeout")
    private Integer takeTimeout;

    /**
     * 售后期限
     */
    @TableField(value = "service_timeout")
    private Integer serviceTimeout;

    /**
     * 自动五星好评
     */
    @TableField(value = "comment_timeout")
    private Integer commentTimeout;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "is_del")
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}
