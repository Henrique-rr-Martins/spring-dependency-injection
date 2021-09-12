package com.spring.dependency.injection.example.implement;

import com.spring.dependency.injection.example.ITextWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Qualifier("RegularWriter")
@Component
public class RegularWriter implements ITextWriter {
    @Override
    public String writeText(String s) {
        return s + " [Regular Writer]";
    }
}
