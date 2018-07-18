package com.demo.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/18 0018
 * 用途：
 * 描述:
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
