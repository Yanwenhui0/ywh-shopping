package com.ywh.shoppingserviceuserapi.pojo;

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
/**
    * 省份信息表
    */
@Data
@TableName(value = "tb_provinces")
public class Provinces implements Serializable {
    /**
     * 省份ID
     */
    @TableId(value = "provinceid", type = IdType.AUTO)
    private String provinceid;

    /**
     * 省份名称
     */
    @TableField(value = "province")
    private String province;

    private static final long serialVersionUID = 1L;
}