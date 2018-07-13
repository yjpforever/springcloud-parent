package com.yjp.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yjp on 2018/7/9.
 */

@FeignClient(value="eureka-client",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface  EurekaClientFeign {
    @GetMapping("/hi")
    String sayHiFromClientEureka(@RequestParam(value="name") String name);
}
