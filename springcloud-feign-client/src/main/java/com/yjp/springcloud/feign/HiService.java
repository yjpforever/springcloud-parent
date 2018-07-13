package com.yjp.springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yjp on 2018/7/9.
 */
@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
