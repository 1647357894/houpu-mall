package com.houpu.item.controller;

import com.houpu.item.pojo.Brand;
import com.houpu.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/brands")
    public List<Brand> getAllBrand(){
        return brandService.queryAllBrand();
    }

}
