package com.nishanth.designpattern.behavioural.observer;

public class Chart implements Observer{
    @Override
    public void update() {
        System.out.println("Chart got notified");
    }
}
