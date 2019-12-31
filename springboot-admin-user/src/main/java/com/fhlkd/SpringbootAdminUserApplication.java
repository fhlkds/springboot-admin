package com.fhlkd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootAdminUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdminUserApplication.class, args);
    }

}
