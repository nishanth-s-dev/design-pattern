package com.nishanth.designpattern.behavioural.chainofresponsibility.http;

import java.util.Objects;

public class Authenticator extends Handler {
    public Authenticator(Handler nextHandler) {
        super(nextHandler);
    }

    public boolean authenticate(HttpRequest request) {
        System.out.println("Authenticating");
        return Objects.equals(request.getUsername(), "Admin") && Objects.equals(request.getPassword(), "Admin@123");
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        return authenticate(request);
    }
}
