package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories
@EnableScheduling
@PropertySource("db.properties")
public class DemoGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGradleApplication.class, args); //ddabc

    }
}
