package com.nishanth.designpattern.behavioural.chainofresponsibility;

import com.nishanth.designpattern.behavioural.chainofresponsibility.http.*;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        handler.handle(request);
    }
}
