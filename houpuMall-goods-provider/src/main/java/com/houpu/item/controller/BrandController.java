package com.houpu.item.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.houpu.item.entity.Brand;
import com.houpu.item.exception.BrandNotFoundException;
import com.houpu.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jie
 * @date 2019/10/29 19:05
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 返回所有品牌
     *
     * @return
     */
    @GetMapping("/all")
    public List<Brand> queryAllBrand() {
        return brandService.queryAllBrand();
    }

    @GetMapping("/{id}")
    public Brand queryBrandById(@PathVariable Integer id) {
        Brand brand = brandService.queryBrandById(id);
        if (brand == null) {
            throw new BrandNotFoundException(id);
        }
        return brand;
    }

    /**
     * 模糊查询
     * @param name
     * @return
     */
    @GetMapping("/name")
    public List<Brand> queryBrandLikeName(@RequestParam String name) {
        List<Brand> brandList = brandService.queryBrandLikeName(name);
        if (brandList == null) {

        }
        return brandList;
    }

    @DeleteMapping("/{id}")
    public void deleteBrandById(@PathVariable Integer id) {
        if (id == null) {

        }
        brandService.deleteBrandById(id);
    }

    @PostMapping("/brand")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void saveBrand(Brand brand) {
        if (brand == null) {

        }
        brandService.saveBrand(brand);

    }

    @PutMapping("/brand")
    public void updateBrandBy(Brand brand) {
        if (brand == null) {

        }
        brandService.updateBrand(brand);
    }


    @GetMapping("/page")
    public IPage<Brand> queryBrandByPage(Page<Brand> page) {
//        page 校验 current  size
        if (page == null) {

        }
        return brandService.findBrandByPage(page);
    }

}
