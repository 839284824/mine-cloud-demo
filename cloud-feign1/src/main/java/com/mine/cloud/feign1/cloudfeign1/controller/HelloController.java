package com.mine.cloud.feign1.cloudfeign1.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongzhao
 * @description
 * @Date 14:082018/6/8
 */
@RestController
@Slf4j
public class HelloController {

    @ApiOperation(value = "添加用户信息", notes = "添加用户信息")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        log.info("===call feign1===");
        return "hello world,feign1";
    }

}
