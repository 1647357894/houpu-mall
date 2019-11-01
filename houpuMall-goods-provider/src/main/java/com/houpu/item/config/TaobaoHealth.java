package com.houpu.item.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author jie
 * @date 2019/11/1 21:38
 */
@Component
public class TaobaoHealth implements
        HealthIndicator {
    @Override
    public Health health() {

        try {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getForObject("http://www.taobao.com", String.class);
        } catch (RestClientException e) {
           return Health.down().build();
        }
            return Health.up().build();
    }
}
