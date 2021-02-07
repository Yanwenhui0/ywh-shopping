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
@TableName(value = "tb_spec")
public class Spec implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 规格选项
     */
    @TableField(value = "`options`")
    private String options;

    /**
     * 排序
     */
    @TableField(value = "seq")
    private Integer seq;

    /**
     * 模板ID
     */
    @TableField(value = "template_id")
    private Integer templateId;

    private static final long serialVersionUID = 1L;
}
