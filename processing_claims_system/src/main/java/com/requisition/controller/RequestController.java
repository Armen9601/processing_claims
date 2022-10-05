package com.requisition.controller;

import com.requisition.model.Request;
import com.requisition.model.enums.RequestType;
import com.requisition.service.impl.RequestServiceImpl;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/request")
public class RequestController {

    @Inject
    private RequestServiceImpl requestService;

    @Post
    public RequestType sendRequestToValidationServices(@Body Request request) {
        return requestService.sendRequestToValidationServiceOne(request);
    }
}
