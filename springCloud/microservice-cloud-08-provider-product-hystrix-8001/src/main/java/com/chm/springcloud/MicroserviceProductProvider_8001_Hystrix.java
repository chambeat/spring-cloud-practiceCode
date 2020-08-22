package com.chm.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix //开启 Hystrix 熔断机制的支持
@EnableEurekaClient //标识一个 Eureka 客户端 (注意：运行启动类后，会自动注册到Eureka服务中心。)
@SpringBootApplication
@MapperScan("com.chm.springcloud.mapper")
public class MicroserviceProductProvider_8001_Hystrix {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProductProvider_8001_Hystrix.class, args);
    }
}
