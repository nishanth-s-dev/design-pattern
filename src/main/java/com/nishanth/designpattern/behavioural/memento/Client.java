package com.nishanth.designpattern.behavioural.memento;

// Memento pattern used for undo mechanism
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History editorHistory = new History();

        editor.setContent("a");
        editorHistory.push(editor.createState());

        editor.setContent("b");
        editorHistory.push(editor.createState());

        editor.setContent("c");

        editor.restore(editorHistory.pop());
        System.out.println(editor.getContent());
    }
}
