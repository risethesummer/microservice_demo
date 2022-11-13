package com.linkho.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * com.linkho.apigw
 * Created by NhatLinh - 19127652
 * Date 11/12/2022 - 8:55 PM
 * Description: ...
 */
@SpringBootApplication
@EnableEurekaClient
public class ApiGWApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(ApiGWApplication.class, args);
    }
}
