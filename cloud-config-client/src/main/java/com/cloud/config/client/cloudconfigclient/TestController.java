package com.cloud.config.client.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongzhao
 * @description
 * @Date 16:262018/6/9
 */
@RestController
public class TestController {

    @Value("${octo.key}")
    private String from = "";

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
}
