package com.nishanth.designpattern.behavioural.strategy.filter;

public class BlackAndWhiteImageFilter implements ImageFilter{
    @Override
    public void filter() {
        System.out.println("black and white image filter");
    }
}
