package com.example;

import com.netflix.loadbalancer.RandomRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@EnableFeignClients
@SpringBootApplication
@MapperScan("com.example.mapper")
public class ServiceConsumerApplication {

  @Bean
  public RandomRule randomRule() {
    return new RandomRule();
  }

  public static void main(String[] args) {
    SpringApplication.run(ServiceConsumerApplication.class,args);
  }

}
