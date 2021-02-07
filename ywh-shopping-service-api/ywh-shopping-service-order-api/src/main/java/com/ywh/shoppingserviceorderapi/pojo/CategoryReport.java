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
@TableName(value = "tb_category_report")
public class CategoryReport implements Serializable {
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
     * 统计日期
     */
    @TableField(value = "count_date")
    private Date countDate;

    /**
     * 销售数量
     */
    @TableField(value = "num")
    private Integer num;

    /**
     * 销售额
     */
    @TableField(value = "money")
    private Integer money;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "is_del")
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}
