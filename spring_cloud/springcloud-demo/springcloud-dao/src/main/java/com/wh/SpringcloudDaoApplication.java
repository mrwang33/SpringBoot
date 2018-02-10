package com.wh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wh.mapper")
public class SpringcloudDaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDaoApplication.class, args);
	}
}
