package com.nishanth.designpattern.behavioural.memento;

// Memento pattern used for undo mechanism
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");

        editor.undoContent();
        editor.undoContent();
        System.out.println(editor.getContent());
    }
}
