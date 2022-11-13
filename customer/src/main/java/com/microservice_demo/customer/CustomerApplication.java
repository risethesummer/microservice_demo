package com.microservice_demo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * com.microservice_demo.customer
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 1:03 PM
 * Description: ...
 */
@SpringBootApplication(
        scanBasePackages = {
                "com.microservice_demo.customer",
                "org.linkho.amqp"
        }
)
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.linkho.clients"
)
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}