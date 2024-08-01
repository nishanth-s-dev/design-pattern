package com.nishanth.designpattern.behavioural.chainofresponsibility.http;

public class Logger extends Handler{
    public Logger(Handler nextHandler) {
        super(nextHandler);
    }

    public void log(HttpRequest request) {
        System.out.println("Log");
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        log(request);
        return true;
    }
}
