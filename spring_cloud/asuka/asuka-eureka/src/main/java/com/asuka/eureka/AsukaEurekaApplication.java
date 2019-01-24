package com.asuka.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AsukaEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(AsukaEurekaApplication.class, args);
  }
}
