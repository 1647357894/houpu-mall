package com.houpu.item.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jie
 * @date 2019/10/30 10:56
 */
@Data
@AllArgsConstructor
public class BrandError {
    private int code;
    private String message;
}
