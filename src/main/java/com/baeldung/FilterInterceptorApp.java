package com.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.baeldung")
public class FilterInterceptorApp {
    public static void main(String[] args) {
        SpringApplication.run(FilterInterceptorApp.class, args);
    }
}