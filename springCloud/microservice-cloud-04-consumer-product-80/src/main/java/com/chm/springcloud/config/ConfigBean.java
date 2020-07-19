package com.chm.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    /* 向容器中添加 RestTemplate 组件，通过此组件可以方便地调用 REST 接口 */
    @Bean
    @LoadBalanced //开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
