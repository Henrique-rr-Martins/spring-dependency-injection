package com.spring.dependency.injection.example.implement;

import com.spring.dependency.injection.example.ITextWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("FancyWriter")
@Component
public class FancyWriter implements ITextWriter {

    @Override
    public String writeText(String s) {
        return s + " [fancy text]";
    }
}
