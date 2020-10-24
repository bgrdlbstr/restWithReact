package com.example.demo;

import com.example.demo.config.CorsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner, WebMvcConfigurer {

    @Autowired
    private CorsProperties corsProperties;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        corsProperties.getOrigins().forEach(
                x -> {
                    var reg = registry.addMapping(x.getMapping());
                    reg.allowedOrigins(x.getOrigin().toArray(String[]::new));
                    reg.allowedMethods(x.getVerb().toArray(String[]::new));
                }
        );
    }

    @Override
    public void run(String... args) {
        System.out.println("corsProperties = " + corsProperties);
    }

}