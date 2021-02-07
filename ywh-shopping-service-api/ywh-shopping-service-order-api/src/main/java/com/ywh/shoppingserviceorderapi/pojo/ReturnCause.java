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
@TableName(value = "tb_return_cause")
public class ReturnCause implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 原因
     */
    @TableField(value = "cause")
    private String cause;

    /**
     * 排序
     */
    @TableField(value = "seq")
    private Integer seq;

    /**
     * 是否启用
     */
    @TableField(value = "`status`")
    private Integer status;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "is_del")
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}
