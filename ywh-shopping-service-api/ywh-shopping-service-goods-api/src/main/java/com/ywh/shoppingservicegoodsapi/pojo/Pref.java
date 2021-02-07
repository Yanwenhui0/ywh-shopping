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
@Data
@TableName(value = "tb_pref")
public class Pref implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类ID
     */
    @TableField(value = "cate_id")
    private Integer cateId;

    /**
     * 消费金额
     */
    @TableField(value = "buy_money")
    private Integer buyMoney;

    /**
     * 优惠金额
     */
    @TableField(value = "pre_money")
    private Integer preMoney;

    /**
     * 活动开始日期
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 活动截至日期
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 类型
     */
    @TableField(value = "`type`")
    private String type;

    /**
     * 状态
     */
    @TableField(value = "`state`")
    private String state;

    private static final long serialVersionUID = 1L;
}
