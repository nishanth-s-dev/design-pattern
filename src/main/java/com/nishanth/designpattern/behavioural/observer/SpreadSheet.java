package com.nishanth.designpattern.behavioural.observer;

public class SpreadSheet implements Observer{
    @Override
    public void update(Object value) {
        System.out.println("SpreadSheet got notified and the value is " + (int) value);
    }
}
