package com.nishanth.designpattern.creational.prototype;

public class ContextMenu {
    public void duplicate(Component component) throws CloneNotSupportedException {
        Component newComponent = component.clone();
        System.out.println(newComponent.getClass());
        // Add to document and so on...
    }
}
