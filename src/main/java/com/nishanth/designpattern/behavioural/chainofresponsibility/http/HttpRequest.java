package com.nishanth.designpattern.behavioural.chainofresponsibility.http;

public class HttpRequest {
    private final String username;
    private final String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
