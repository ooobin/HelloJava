package com.example.hellojava.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Config Cors
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*", "https://domain1.com")
                .allowedMethods("GET", "POST")
//                .allowedHeaders("header1", "header2", "header3")
                .allowCredentials(false) // 是否允许发送 Cookie
                .maxAge(3600);
    }
}

