package com.nishanth.designpattern.creational.prototype;

public class ContextMenu {
    public void duplicate(Component component) {
        if (component instanceof Circle) {
            Circle source = (Circle) component;
            Circle target = new Circle();
            target.setRedius(source.getRedius());
            // Add target to our document, and so on...
        }
    }
}
