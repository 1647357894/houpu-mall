package com.houpu.item.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.houpu.item.entity.Brand;

import java.util.List;

/**
 * @author jie
 * @date 2019/10/29 19:05
 */
public interface BrandService {
    Brand queryBrandById(Integer id);

    List<Brand> queryAllBrand();

    List<Brand> queryBrandLikeName(String name);

    void deleteBrandById(Integer id);

    void saveBrand(Brand brand);

    void updateBrand(Brand brand);


    IPage<Brand> findBrandByPage(IPage<Brand> page);
}
