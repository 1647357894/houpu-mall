package com.houpu.item.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.houpu.item.entity.Brand;
import com.houpu.item.mapper.BrandMapper;
import com.houpu.item.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author jie
 * @date 2019/10/29 19:18
 */
@Service
@Slf4j
public class BrandServiceImpl implements BrandService {


    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Brand queryBrandById(Integer id) {
        log.info("查询品牌的id: {}", id);
        return brandMapper.selectById(id);
    }

    @Override
    public List<Brand> queryAllBrand() {
        List<Brand> brands = brandMapper.selectList(null);
        if (ObjectUtils.isEmpty(brands)) {
            return Collections.emptyList();
        }
        return brands;
    }

    @Override
    public List<Brand> queryBrandLikeName(String name) {

        QueryWrapper<Brand> qw = new QueryWrapper<>();
        qw.lambda().like(Brand::getName, name);

        LambdaQueryWrapper<Brand> lqw = new QueryWrapper<Brand>().lambda();

        lqw.like(Brand::getName, name).select(Brand::getName, Brand::getLetter);

        return brandMapper.selectList(qw);
    }

    @Override
    public void deleteBrandById(Integer id) {
        log.info("删除品牌的id：{}", id);
        brandMapper.deleteById(id);
    }

    @Override
    public void saveBrand(Brand brand) {
        log.info("保存品牌：{}", brand);
        int i = brandMapper.insert(brand);

    }

    @Override
    public void updateBrand(Brand brand) {
        log.info("更新品牌 {}", brand);
        brandMapper.updateById(brand);
        UpdateWrapper<Brand> uw = new UpdateWrapper<>();
        uw.setEntity(brand);

        LambdaUpdateWrapper<Brand> luw = new UpdateWrapper<Brand>().lambda();

    }

    @Override
    public IPage<Brand> findBrandByPage(IPage<Brand> page) {
        QueryWrapper<Brand> qw = new QueryWrapper<>();
        IPage<Brand> brandIPage = brandMapper.selectPage(page, qw);
        return brandIPage;
    }


}
