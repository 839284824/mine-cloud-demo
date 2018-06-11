package com.mine.cloud.ribbon1.cloudribbon1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudRibbon1Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudRibbon1Application.class, args);
    }
}
