package com.nishanth.designpattern.behavioural.memento;

// Memento pattern used for undo mechanism
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History editorHistory = new History();

        editor.setContent("a");
        editor.setTitle("title a");
        editorHistory.push(editor.createState());

        editor.setContent("b");
        editor.setTitle("title b");
        editorHistory.push(editor.createState());

        editor.setContent("c");
        editorHistory.push(editor.createState());


        editor.setContent("d");
        editor.setTitle("title d");

        editor.restore(editorHistory.pop());
        editor.restore(editorHistory.pop());
        editor.restore(editorHistory.pop());
        System.out.println(editor.getContent());
        System.out.println(editor.getTitle());
    }
}
