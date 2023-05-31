package com.gemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Exclude DataSourceAutoConfiguration only to be used when there is no database setup for the application
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
 */
@SpringBootApplication
public class Main {
    public static void main(final String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
