package com.mine.cloud.ribbon1.cloudribbon1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongzhao
 * @description
 * @Date 14:082018/6/8
 */
@RestController
public class HelloController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello world";
    }

}
