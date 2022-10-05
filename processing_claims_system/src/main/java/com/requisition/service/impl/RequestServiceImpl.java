package com.requisition.service.impl;

import com.requisition.client.ValidationServiceOneClient;
import com.requisition.model.Request;
import com.requisition.model.enums.RequestType;
import com.requisition.service.RequestService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class RequestServiceImpl implements RequestService {

    @Inject
    private ValidationServiceOneClient validationServiceOneClient;

    @Override
    public RequestType sendRequestToValidationServiceOne(Request request) {
        String validation = validationServiceOneClient.validation(request);
        System.out.println(validation);
        return RequestType.PENDING;
    }
}
