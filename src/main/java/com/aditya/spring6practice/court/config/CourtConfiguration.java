package com.aditya.spring6practice.court.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.aditya.spring6practice.court")
@EnableWebMvc
public class CourtConfiguration {
    
    
}
