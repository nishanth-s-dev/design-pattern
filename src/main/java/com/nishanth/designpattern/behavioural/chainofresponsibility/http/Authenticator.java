package com.nishanth.designpattern.behavioural.chainofresponsibility.http;

import java.util.Objects;

public class Authenticator {
    public boolean authenticate(HttpRequest request) {
        System.out.println("Authenticating");
        return Objects.equals(request.getUsername(), "Admin") && Objects.equals(request.getPassword(), "Admin@123");
    }
}
