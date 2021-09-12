package com.spring.dependency.injection.controller;

import com.spring.dependency.injection.service.HelloWorldService;
import com.spring.dependency.injection.service.HelloWorldServiceWithConfigurationMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class HelloWorldController {
    @Autowired
    private HelloWorldService service;

    @Autowired
    private HelloWorldServiceWithConfigurationMethods serviceConfig;

    @GetMapping
    public String writeText(){
        return this.service.sayHelloWorld();
    }

    @GetMapping(value="/config-writer")
    public String writeTextWithConfig(){
        return this.serviceConfig.sayHelloWorld();
    }
}