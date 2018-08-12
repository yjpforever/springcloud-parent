package com.yjp.springcloud.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author yangjp
 * @create 2018-08-12 22:09
 */
@Service
public class HiService {

    @HystrixCommand(fallbackMethod = "sayHiError")
    public String sayHi()  {
        // restTemplate.getForObject 这里应该是调用其它服务
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String s = "hi!";

        return s;
    }

    public String sayHiError(){
        return "sayHiError!";
    }

}
