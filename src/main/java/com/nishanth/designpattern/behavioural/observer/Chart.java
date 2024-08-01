package com.nishanth.designpattern.behavioural.observer;

public class Chart implements Observer{
    @Override
    public void update(Object value) {
        System.out.println("Chart got notified and the value is " + (int) value);
    }
}
