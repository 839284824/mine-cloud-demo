package com.mine.cloud.feign2.cloudfeign2.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gongzhao
 * @description
 * @Date 14:432018/6/8
 */
@FeignClient(value = "CLOUD-FEIGN1")
@Service
public interface FeignHello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
