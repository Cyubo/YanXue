package com.YanXue;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启网关代理
public class YanXue_zuul_9527 {

    public static void main(String[]args){
        SpringApplication.run(YanXue_zuul_9527.class,args);

    }
}
