package com.houpu.item.service.impl;

import com.houpu.item.mapper.BrandMapper;
import com.houpu.item.pojo.Brand;
import com.houpu.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jie
 * @date 2019/10/29 19:18
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> queryAllBrand() {
        return brandMapper.selectAll();
    }
}
