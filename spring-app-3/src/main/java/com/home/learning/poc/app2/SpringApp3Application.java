package com.home.learning.poc.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.home.learning.poc"})
public class SpringApp3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringApp3Application.class, args);
    }

}
