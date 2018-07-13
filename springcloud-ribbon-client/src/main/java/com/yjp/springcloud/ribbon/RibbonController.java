package com.yjp.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yjp on 2018/7/9.
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(String name){
        return ribbonService.hi(name);
    }
}
