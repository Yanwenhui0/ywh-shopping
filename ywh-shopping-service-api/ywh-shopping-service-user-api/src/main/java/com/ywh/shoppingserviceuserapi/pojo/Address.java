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
@Data
@TableName(value = "tb_address")
public class Address implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 省
     */
    @TableField(value = "provinceid")
    private String provinceid;

    /**
     * 市
     */
    @TableField(value = "cityid")
    private String cityid;

    /**
     * 县/区
     */
    @TableField(value = "areaid")
    private String areaid;

    /**
     * 电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 详细地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 联系人
     */
    @TableField(value = "contact")
    private String contact;

    /**
     * 是否是默认 1默认 0否
     */
    @TableField(value = "is_default")
    private String isDefault;

    /**
     * 别名
     */
    @TableField(value = "`alias`")
    private String alias;

    private static final long serialVersionUID = 1L;
}