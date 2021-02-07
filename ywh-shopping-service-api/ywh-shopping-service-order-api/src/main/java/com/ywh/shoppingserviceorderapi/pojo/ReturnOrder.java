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
@TableName(value = "tb_return_order")
public class ReturnOrder implements Serializable {
    /**
     * 服务单号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 订单号
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 申请时间
     */
    @TableField(value = "apply_time")
    private Date applyTime;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 用户账号
     */
    @TableField(value = "user_account")
    private String userAccount;

    /**
     * 联系人
     */
    @TableField(value = "linkman")
    private String linkman;

    /**
     * 联系人手机
     */
    @TableField(value = "linkman_mobile")
    private String linkmanMobile;

    /**
     * 类型
     */
    @TableField(value = "`type`")
    private String type;

    /**
     * 退款金额
     */
    @TableField(value = "return_money")
    private Integer returnMoney;

    /**
     * 是否退运费
     */
    @TableField(value = "is_return_freight")
    private String isReturnFreight;

    /**
     * 申请状态
     */
    @TableField(value = "`status`")
    private String status;

    /**
     * 处理时间
     */
    @TableField(value = "dispose_time")
    private Date disposeTime;

    /**
     * 退货退款原因
     */
    @TableField(value = "return_cause")
    private Integer returnCause;

    /**
     * 凭证图片
     */
    @TableField(value = "evidence")
    private String evidence;

    /**
     * 问题描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 处理备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 管理员id
     */
    @TableField(value = "admin_id")
    private Integer adminId;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "is_del")
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}
