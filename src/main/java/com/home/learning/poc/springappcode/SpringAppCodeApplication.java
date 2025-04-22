package com.home.learning.poc.springappcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = {"com.home.learning.poc"})
public class SpringAppCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppCodeApplication.class, args);
    }

}
