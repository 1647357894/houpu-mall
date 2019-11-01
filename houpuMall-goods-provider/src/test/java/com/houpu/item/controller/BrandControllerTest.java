package com.houpu.item.controller;

import com.houpu.item.HpItemService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.annotation.WebInitParam;

import static org.springframework.test.web.servlet.ResultMatcher.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author jie
 * @date 2019/11/1 13:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HpItemService.class)
@WebAppConfiguration //开启web上下文测试

public class BrandControllerTest {

    @Autowired
    private WebApplicationContext webContext;
    private MockMvc mockMvc;

    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
    }

    @Test
    public void queryAllBrand() {
    }

    @Test
    public void queryBrandById() throws Exception {
        mockMvc.perform(get("/brand/6742"))
                .andExpect(matchAll(
                        status().isOk()
                ))
        ;

    }

    @Test
    public void queryBrandLikeName() {
    }

    @Test
    public void deleteBrandById() {
    }

    @Test
    public void saveBrand() throws Exception {
        mockMvc.perform(post("/brand/brand")
        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
        .param("image","null")
                .param("letter","Y")
                .param("name","一加一")
                .param("seq","1"))
                .andExpect(status().isCreated());

    }

    @Test
    public void updateBrandBy() {
    }

    @Test
    public void queryBrandByPage() {
    }
}