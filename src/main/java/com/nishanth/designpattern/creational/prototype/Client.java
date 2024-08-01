package com.nishanth.designpattern.creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Component circle = new Circle();
        ContextMenu contextMenu = new ContextMenu();

        contextMenu.duplicate(circle);

        System.out.println("This commit for confirm - my solution is prototype pattern \uD83D\uDE0E");
    }
}
