package com.houpu.item;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author jie
 * @date 2019/10/29 19:29
 */
@SpringBootApplication
public class HpItemService {
    public static void main(String[] args) {
        SpringApplication.run(HpItemService.class, args);
    }


}
