package com.mine.cloud.ribbon2.cloudribbon2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gongzhao
 * @description
 * @Date 14:082018/6/8
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/hello")
    public String hello() {
        return restTemplate.getForObject("http://ribbon1/hello", String.class);
    }
}
