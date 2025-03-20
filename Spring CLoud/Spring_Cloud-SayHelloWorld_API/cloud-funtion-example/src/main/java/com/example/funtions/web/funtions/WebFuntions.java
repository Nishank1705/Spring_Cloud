package com.example.funtions.web.funtions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class WebFuntions {

    @Bean
    public Supplier<String> sayHello() {
        return () -> "Hello, I am Pappu!";
    }
}
