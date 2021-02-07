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
@TableName(value = "tb_template")
public class Template implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 模板名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 规格数量
     */
    @TableField(value = "spec_num")
    private Integer specNum;

    /**
     * 参数数量
     */
    @TableField(value = "para_num")
    private Integer paraNum;

    private static final long serialVersionUID = 1L;
}
