package com.nishanth.designpattern.creational.prototype;

public class Circle implements Component{
    private int radius;

    @Override
    public void render() {
        System.out.println("Rendering Circle");
    }

    public int getRedius() {
        return radius;
    }

    public void setRedius(int redius) {
        this.radius = redius;
    }
}
