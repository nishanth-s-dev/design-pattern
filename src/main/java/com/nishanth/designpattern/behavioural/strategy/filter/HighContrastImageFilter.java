package com.nishanth.designpattern.behavioural.strategy.filter;

public class HighContrastImageFilter implements ImageFilter{
    @Override
    public void filter() {
        System.out.println("high contrast image filter");
    }
}
