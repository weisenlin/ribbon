package com.demo.ribbon.controller;

import com.demo.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/18 0018
 * 用途：
 * 描述:
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(String name){
        return helloService.hiService(name);
    }
}
