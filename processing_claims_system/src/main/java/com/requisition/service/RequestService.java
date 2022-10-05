package com.requisition.service;

import com.requisition.model.Request;
import com.requisition.model.enums.RequestType;

public interface RequestService {

    RequestType sendRequestToValidationServiceOne(Request request);

}
