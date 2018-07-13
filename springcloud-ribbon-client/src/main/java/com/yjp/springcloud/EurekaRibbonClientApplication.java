package com.yjp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by yjp on 2018/7/9.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class EurekaRibbonClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonClientApplication.class,args);
    }
}
