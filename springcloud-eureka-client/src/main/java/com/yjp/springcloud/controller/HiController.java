package com.yjp.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yjp on 2018/7/9.
 */
@RestController
public class HiController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/hi")
    public String hi(String name){
        return "hi:"+name+" from:"+port;
    }
}
