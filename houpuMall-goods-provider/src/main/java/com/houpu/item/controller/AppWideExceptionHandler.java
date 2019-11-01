package com.houpu.item.controller;

import com.houpu.item.dto.BrandError;
import com.houpu.item.exception.BrandNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author jie
 * @date 2019/10/30 10:51
 * 统一异常处理
 */
@RestControllerAdvice
public class AppWideExceptionHandler {

    /**
     * 品牌信息找不到
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BrandNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public BrandError brandNotFound(BrandNotFoundException e) {
        Integer brandId = e.getBrandId();
        return new BrandError(404, "Brand [" + brandId + "] not found");
    }
}
