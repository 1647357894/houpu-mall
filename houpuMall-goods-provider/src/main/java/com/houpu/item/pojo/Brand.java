package com.houpu.item.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "tb_brand")
public class Brand implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 品牌id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

