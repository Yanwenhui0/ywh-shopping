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
    * 行政区域地州市信息表
    */
@Data
@TableName(value = "tb_cities")
public class Cities implements Serializable {
    /**
     * 城市ID
     */
    @TableId(value = "cityid", type = IdType.AUTO)
    private String cityid;

    /**
     * 城市名称
     */
    @TableField(value = "city")
    private String city;

    /**
     * 省份ID
     */
    @TableField(value = "provinceid")
    private String provinceid;

    private static final long serialVersionUID = 1L;
}