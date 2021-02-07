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
@TableName(value = "tb_order")
public class Order implements Serializable {
    /**
     * 订单id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 数量合计
     */
    @TableField(value = "total_num")
    private Integer totalNum;

    /**
     * 金额合计
     */
    @TableField(value = "total_money")
    private Integer totalMoney;

    /**
     * 优惠金额
     */
    @TableField(value = "pre_money")
    private Integer preMoney;

    /**
     * 邮费
     */
    @TableField(value = "post_fee")
    private Integer postFee;

    /**
     * 实付金额
     */
    @TableField(value = "pay_money")
    private Integer payMoney;

    /**
     * 支付类型，1、在线支付、0 货到付款
     */
    @TableField(value = "pay_type")
    private String payType;

    /**
     * 订单创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 订单更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 付款时间
     */
    @TableField(value = "pay_time")
    private Date payTime;

    /**
     * 发货时间
     */
    @TableField(value = "consign_time")
    private Date consignTime;

    /**
     * 交易完成时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 交易关闭时间
     */
    @TableField(value = "close_time")
    private Date closeTime;

    /**
     * 物流名称
     */
    @TableField(value = "shipping_name")
    private String shippingName;

    /**
     * 物流单号
     */
    @TableField(value = "shipping_code")
    private String shippingCode;

    /**
     * 用户名称
     */
    @TableField(value = "username")
    private String username;

    /**
     * 买家留言
     */
    @TableField(value = "buyer_message")
    private String buyerMessage;

    /**
     * 是否评价
     */
    @TableField(value = "buyer_rate")
    private Integer buyerRate;

    /**
     * 收货人
     */
    @TableField(value = "receiver_contact")
    private String receiverContact;

    /**
     * 收货人手机
     */
    @TableField(value = "receiver_mobile")
    private String receiverMobile;

    /**
     * 收货人地址
     */
    @TableField(value = "receiver_address")
    private String receiverAddress;

    /**
     * 订单来源：1:web，2：app，3：微信公众号，4：微信小程序  5 H5手机页面
     */
    @TableField(value = "source_type")
    private Integer sourceType;

    /**
     * 交易流水号
     */
    @TableField(value = "transaction_id")
    private String transactionId;

    /**
     * 订单状态
     */
    @TableField(value = "order_status")
    private Integer orderStatus;

    /**
     * 支付状态 0:未支付 1:已支付
     */
    @TableField(value = "pay_status")
    private Integer payStatus;

    /**
     * 发货状态 0:未发货 1:已发货 2:已送达
     */
    @TableField(value = "consign_status")
    private Integer consignStatus;

    @TableField(value = "is_del")
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}
