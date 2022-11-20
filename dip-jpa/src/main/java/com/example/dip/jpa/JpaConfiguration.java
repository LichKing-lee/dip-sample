package com.example.dip.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.example.dip.jpa")
@EnableJpaRepositories(basePackages = "com.example.dip.jpa")
public class JpaConfiguration {
}
