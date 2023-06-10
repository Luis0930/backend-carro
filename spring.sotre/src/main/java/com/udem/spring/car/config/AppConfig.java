package com.udem.spring.car.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.udem.spring.car.service",
        includeFilters = {@ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+Service$")},
        useDefaultFilters = false)
public class AppConfig {
}
