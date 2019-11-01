package com.houpu.item.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@TableName(value = "tb_brand")
@Accessors(chain = true)
public class Brand implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 品牌id
     */
    private Integer id;
    /**
     * 品牌名称
     */
    private String name;
    /**
     * 品牌图片地址
     */
    private String image;
    /**
     * 品牌的首字母
     */
    private String letter;
    /**
     * 排序
     */
    private Integer seq;
}

