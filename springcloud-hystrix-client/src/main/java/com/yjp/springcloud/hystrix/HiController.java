package com.yjp.springcloud.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjp
 * @create 2018-08-12 22:12
 */
@RestController
public class HiController {
    @Autowired
    private HiService hiService;

    @RequestMapping("/sayHi")
    public String sayHi(){
        return hiService.sayHi();
    }
    // 此注解除了可以作用在service上也可以在controller上使用，如果方法内抛出异常则直接调用指定的error方法
    @HystrixCommand(fallbackMethod = "sayHelloFeedback")
    @RequestMapping("/sayHello/{id}")
    public String sayHello(@PathVariable("id") Integer id){
        if(id==1){
            throw new RuntimeException("id not right");
        }
        return "hello:"+id;
    }

    public String sayHelloFeedback(@PathVariable("id") Integer id){
        return "hello feedback";
    }

}
