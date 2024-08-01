package com.nishanth.designpattern.behavioural.chainofresponsibility;

import com.nishanth.designpattern.behavioural.chainofresponsibility.http.Authenticator;
import com.nishanth.designpattern.behavioural.chainofresponsibility.http.Compressor;
import com.nishanth.designpattern.behavioural.chainofresponsibility.http.HttpRequest;
import com.nishanth.designpattern.behavioural.chainofresponsibility.http.Logger;

public class Client {
    public static void main(String[] args) {
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("Admin", "Admin@123"));
    }
}
