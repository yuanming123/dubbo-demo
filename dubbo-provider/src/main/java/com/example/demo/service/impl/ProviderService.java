package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.DemoService;

/**
 * @ClassName ProviderService
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/31 21:22
 **/
@Service(version = "1.0.0")
public class ProviderService implements DemoService {
    @Override
    public String sayHello() {
        return "大家好!";
    }
}
