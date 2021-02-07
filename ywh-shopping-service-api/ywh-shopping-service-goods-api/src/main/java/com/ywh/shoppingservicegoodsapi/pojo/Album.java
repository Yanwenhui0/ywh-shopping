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
@TableName(value = "tb_album")
public class Album implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 相册名称
     */
    @TableField(value = "title")
    private String title;

    /**
     * 相册封面
     */
    @TableField(value = "image")
    private String image;

    /**
     * 图片列表
     */
    @TableField(value = "image_items")
    private String imageItems;

    private static final long serialVersionUID = 1L;
}
