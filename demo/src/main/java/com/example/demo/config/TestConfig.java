package com.example.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liaoyushao
 */
@Configuration
public class TestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate loadbalancedRestTemplate() {
        return new RestTemplate();
    }
}
