package com.spring.dependency.injection.config;

import com.spring.dependency.injection.example.implement.FancyWriter;
import com.spring.dependency.injection.example.implement.RegularWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextWriterConfig {
    @Bean(name="FancyWriter")
    public FancyWriter getFancyWriterInstance(){
        return new FancyWriter();
    }

    @Bean(name="RegularWriter")
    public RegularWriter getRegularWriterInstance(){
        return new RegularWriter();
    }
}
