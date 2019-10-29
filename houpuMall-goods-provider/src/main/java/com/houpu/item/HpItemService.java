package com.houpu.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author jie
 * @date 2019/10/29 19:29
 */
@SpringBootApplication
@MapperScan("com.houpu.item.mapper")
public class HpItemService {
    public static void main(String[] args) {
        SpringApplication.run(HpItemService.class);
    }
}
