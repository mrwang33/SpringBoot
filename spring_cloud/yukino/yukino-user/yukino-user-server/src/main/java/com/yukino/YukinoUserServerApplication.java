package com.yukino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YukinoUserServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(YukinoUserServerApplication.class, args);
  }

}
