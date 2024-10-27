package com.idat.saludar.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.soap.SaludarRequest;
import com.example.soap.SaludarResponse;

@Endpoint
public class SaludarEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/soap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SaludarRequest")
    @ResponsePayload
    public SaludarResponse saludar(@RequestPayload SaludarRequest request) {
        SaludarResponse response = new SaludarResponse();
        response.setSaludo("Hola " + request.getNombre());
        return response;
    }

}
