package com.spring.dependency.injection.service;

import com.spring.dependency.injection.example.ITextWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
public class HelloWorldService {
    private final ITextWriter writer;

    //@Qualifier pode ser usado direto no atributo ou através do parâmetro do método construtor
    public HelloWorldService(@Qualifier("RegularWriter") ITextWriter writer) {
        this.writer = writer;
    }

    public String sayHelloWorld() {
        return this.writer.writeText("Hello world!!!");
    }
}
