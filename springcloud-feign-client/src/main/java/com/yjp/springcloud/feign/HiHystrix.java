package com.yjp.springcloud.feign;

import org.springframework.stereotype.Component;

/**
 * Created by yjp on 2018/7/9.
 */
@Component
public class HiHystrix implements EurekaClientFeign{
    @Override
    public String sayHiFromClientEureka(String name) {
        return "sorry,server not available";
    }
}
