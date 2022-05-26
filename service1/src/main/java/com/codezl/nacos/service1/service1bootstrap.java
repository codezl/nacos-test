package com.codezl.nacos.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class service1bootstrap {

    public static void main(String[] args) {
      SpringApplication.run(service1bootstrap.class,args);
    }

    @Autowired
    ConfigurableApplicationContext applicationContext;
    @Value("${common.name}")
    private String config1;

    @GetMapping("/configs")
    public String getConfigs() {
//        return  config1;
        return applicationContext.getEnvironment().getProperty("common.name");
    }

}
