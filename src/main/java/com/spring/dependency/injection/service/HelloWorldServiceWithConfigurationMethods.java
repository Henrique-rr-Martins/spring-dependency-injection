package com.spring.dependency.injection.service;

import com.spring.dependency.injection.example.ITextWriter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HelloWorldServiceWithConfigurationMethods{
    @Resource(name="FancyWriter")
    private ITextWriter writer;

    public String sayHelloWorld() {
        return this.writer.writeText("Hello world!!!");
    }
}
