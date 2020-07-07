package com.chm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //标识一个 Eureka 服务注册中心
@SpringBootApplication
public class EurekaServer_6001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6001.class, args);
    }
}
