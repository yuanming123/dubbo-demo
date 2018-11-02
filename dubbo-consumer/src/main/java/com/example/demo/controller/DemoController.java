package com.example.demo.controller;

import com.example.demo.service.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/29 21:34
 **/
@RestController
public class DemoController {

    @Autowired
    private SayService sayService;

    @RequestMapping("/test")
    public String sayHello(){
        String str = sayService.sayHello();
        return str;
    }
}
