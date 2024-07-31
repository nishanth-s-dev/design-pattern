package com.nishanth.designpattern.behavioural.observer;

public class SpreadSheet implements Observer{
    @Override
    public void update() {
        System.out.println("SpreadSheet got notified");
    }
}
