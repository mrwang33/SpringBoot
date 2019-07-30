package com.yukino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YukinoEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(YukinoEurekaApplication.class, args);
  }

}
