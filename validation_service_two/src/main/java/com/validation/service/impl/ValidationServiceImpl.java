package com.validation.service.impl;

import com.validation.model.Request;
import com.validation.service.ValidationService;
import jakarta.inject.Singleton;

import java.time.LocalDateTime;

@Singleton
public class ValidationServiceImpl implements ValidationService {

    @Override
    public boolean validate(Request request) {
        System.out.println("hello");
        return request.getCreatedDate().isBefore(LocalDateTime.now());
    }
}
