package com.mine.cloud.feign2.cloudfeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudFeign2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeign2Application.class, args);
    }
}
