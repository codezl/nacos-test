package com.codezl.nacos.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Service2bootstrap {

    public static void main(String[] args) {

        SpringApplication.run(Service2bootstrap.class,args);
    }

    @Value("${commom.name}")
    private String config2;

    @GetMapping("/config2")
    public String getConfig2() {
        return config2;
    }
}
