package com.yjp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by yjp on 2018/7/9.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EurekaZuulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulClientApplication.class,args);
        System.out.println("test111");

    }
}
