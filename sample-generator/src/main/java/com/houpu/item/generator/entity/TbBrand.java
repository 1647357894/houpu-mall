package com.houpu.item.generator.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author wj
 * @since 2019-10-31
 */
@Data
@Accessors(chain = true)
public class TbBrand  {

    private static final long serialVersionUID = 1L;

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
