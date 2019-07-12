package com.jay.euerka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Euerka2Application {

    public static void main(String[] args) {
        SpringApplication.run(Euerka2Application.class, args);
    }

}
