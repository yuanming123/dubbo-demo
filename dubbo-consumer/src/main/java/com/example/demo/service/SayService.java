package com.example.demo.service;



import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @ClassName SayService
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/29 21:30
 **/
@Component
public class SayService {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    public String sayHello(){
        return demoService.sayHello();
    }

}
