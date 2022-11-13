package com.example.dip.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.dip")
public class DipApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DipApiApplication.class, args);
    }

}
