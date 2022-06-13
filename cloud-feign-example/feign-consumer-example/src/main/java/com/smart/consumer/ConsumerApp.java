package com.smart.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsumerApp {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerApp.class, args);
  }
}
