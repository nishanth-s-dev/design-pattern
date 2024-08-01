package com.nishanth.designpattern.behavioural.chainofresponsibility;

import com.nishanth.designpattern.behavioural.chainofresponsibility.http.Authenticator;
import com.nishanth.designpattern.behavioural.chainofresponsibility.http.Compressor;
import com.nishanth.designpattern.behavioural.chainofresponsibility.http.HttpRequest;
import com.nishanth.designpattern.behavioural.chainofresponsibility.http.Logger;

public class WebServer {
    public void handle(HttpRequest request) {
        // Authentication
        Authenticator authenticator = new Authenticator();
        authenticator.authenticate(request);

        // Log
        Logger logger = new Logger();
        logger.log(request);

        // Compression
        Compressor compressor  = new Compressor();
        compressor.compress(request);
    }
}
