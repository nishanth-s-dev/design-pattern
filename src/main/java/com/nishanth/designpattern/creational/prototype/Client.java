package com.nishanth.designpattern.creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Component circle = new Circle();
        ContextMenu contextMenu = new ContextMenu();

        contextMenu.duplicate(circle);
    }
}
