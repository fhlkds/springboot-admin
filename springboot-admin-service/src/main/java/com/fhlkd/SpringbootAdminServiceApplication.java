package com.fhlkd;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class SpringbootAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdminServiceApplication.class, args);
	}

}
