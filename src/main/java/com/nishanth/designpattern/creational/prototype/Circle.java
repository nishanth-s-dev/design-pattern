package com.nishanth.designpattern.creational.prototype;

public class Circle implements Component{
    private int radius;

    @Override
    public void render() {
        System.out.println("Rendering Circle");
    }

    @Override
    public Component clone() throws CloneNotSupportedException {
        Circle newCircle = new Circle();
        newCircle.radius = this.radius;
        return newCircle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int redius) {
        this.radius = redius;
    }
}
