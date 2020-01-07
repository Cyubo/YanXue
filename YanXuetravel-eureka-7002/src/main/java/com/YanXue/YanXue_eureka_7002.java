package com.YanXue;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YanXue_eureka_7002 {
    public static void main(String[] agrs){
        SpringApplication.run(YanXue_eureka_7002.class,agrs);

    }
}
