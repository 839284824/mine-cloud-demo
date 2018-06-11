package com.mine.cloud.feign2.cloudfeign2.controller;

import com.mine.cloud.feign2.cloudfeign2.service.FeignHello;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongzhao
 * @description
 * @Date 14:082018/6/8
 */
@RestController
@Api
@Slf4j
public class HelloController {

    @Autowired
    FeignHello feignHello;


    /**
     * @param
     * @return
     * @author gongzhao
     * @Date 15:05 2018/6/8
     * @Api：修饰整个类，描述Controller的作用
     * @ApiOperation：描述一个类的一个方法，或者说一个接口
     * @ApiParam：单个参数描述
     * @ApiModel：用对象来接收参数
     * @ApiProperty：用对象接收参数时，描述对象的一个字段
     * @ApiResponse：HTTP响应其中1个描述
     * @ApiResponses：HTTP响应整体描述
     * @ApiIgnore：使用该注解忽略这个API
     * @ApiError ：发生错误返回的信息
     * @ApiParamImplicitL：一个请求参数
     * @ApiParamsImplicit 多个请求参数
     */
    @ApiOperation(value = "添加用户信息", notes = "添加用户信息")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        log.info("===call feign2===");
        return "hello world,feign2";
    }


    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello2() {
        log.info("===call feign1===");
        return feignHello.hello();
    }

}
