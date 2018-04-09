package com.asuka.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AsukaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsukaUserApplication.class, args);
	}
}
