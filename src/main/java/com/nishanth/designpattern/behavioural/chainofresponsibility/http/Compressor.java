package com.nishanth.designpattern.behavioural.chainofresponsibility.http;

public class Compressor extends Handler{
    public Compressor(Handler nextHandler) {
        super(nextHandler);
    }

    public void compress(HttpRequest request) {
        System.out.println("Compress");
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        compress(request);
        return true;
    }
}
