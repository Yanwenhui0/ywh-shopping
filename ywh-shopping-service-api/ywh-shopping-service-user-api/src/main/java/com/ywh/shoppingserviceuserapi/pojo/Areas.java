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
    * 行政区域县区信息表
    */
@Data
@TableName(value = "tb_areas")
public class Areas implements Serializable {
    /**
     * 区域ID
     */
    @TableId(value = "areaid", type = IdType.AUTO)
    private String areaid;

    /**
     * 区域名称
     */
    @TableField(value = "area")
    private String area;

    /**
     * 城市ID
     */
    @TableField(value = "cityid")
    private String cityid;

    private static final long serialVersionUID = 1L;
}