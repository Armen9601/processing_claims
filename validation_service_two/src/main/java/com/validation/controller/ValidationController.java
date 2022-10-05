package com.validation.controller;

import com.validation.model.Request;
import com.validation.service.impl.ValidationServiceImpl;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("validation-one")
public class ValidationController {

    @Inject
    private ValidationServiceImpl validationService;

    @Post
    public void validation(@Body Request request) {
        validationService.validate(request);
    }

}
