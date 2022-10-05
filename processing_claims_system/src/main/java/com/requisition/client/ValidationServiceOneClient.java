package com.requisition.client;

import com.requisition.model.Request;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(path = "http://localhost:8076")
public interface ValidationServiceOneClient {

    @Post(uri = "/validation-one")
    String validation(Request request);

}
