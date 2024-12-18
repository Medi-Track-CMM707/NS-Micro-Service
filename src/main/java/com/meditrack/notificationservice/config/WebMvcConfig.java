package com.meditrack.notificationservice.config;

import com.meditrack.notificationservice.interceptor.HeaderInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    private final HeaderInterceptor headerInterceptor;

    public WebMvcConfig(HeaderInterceptor headerInterceptor) {
        this.headerInterceptor = headerInterceptor;
        System.out.println("Datasource URL: " + datasourceUrl);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Add your custom interceptor
        registry.addInterceptor(headerInterceptor);
    }
}