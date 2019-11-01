package com.houpu.item.exception;

/**
 * @author jie
 * @date 2019/10/30 10:52
 * 品牌异常类
 */
public class BrandNotFoundException extends RuntimeException {
    private Integer brandId;

    public BrandNotFoundException(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getBrandId() {
        return brandId;
    }
}
