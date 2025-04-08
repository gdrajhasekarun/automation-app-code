package com.home.learning.poc.springappcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.home.learning"})
public class SpringAppCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppCodeApplication.class, args);
    }

}
