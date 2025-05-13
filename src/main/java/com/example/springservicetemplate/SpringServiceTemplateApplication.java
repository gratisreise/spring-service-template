package com.example.springservicetemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringServiceTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceTemplateApplication.class, args);
    }

}
