package com.jay.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

@SpringBootApplication
@EnableDiscoveryClient
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String port = scanner.nextLine();
//        new SpringApplicationBuilder(MemberApplication.class)
//                .properties("server.port=" + port).run(args);
//    }



}
