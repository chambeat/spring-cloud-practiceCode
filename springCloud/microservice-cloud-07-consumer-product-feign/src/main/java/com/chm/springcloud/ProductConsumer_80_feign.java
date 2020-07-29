package com.chm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
// 会扫描指定包下使用了@FeignClient标识的接口
@EnableFeignClients(basePackages = "com.chm.springcloud.service")
public class ProductConsumer_80_feign {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_feign.class, args);
    }
}
