package com.nishanth.designpattern.behavioural.memento;

// Memento pattern used for undo mechanism
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History editorHistory = new History();

        editor.setContent("a");
        editor.setTitle("title a");
        editor.setTool("Brush");
        editorHistory.push(editor.createState());

        editor.setContent("b");
        editor.setTitle("title b");
        editor.setTool("Eraser");
        editorHistory.push(editor.createState());

        editor.setContent("c");
        editorHistory.push(editor.createState());


        editor.setContent("d");
        editor.setTitle("title d");
        editor.setTool("Pen");

        editor.restore(editorHistory.pop());
        System.out.println(editor.getContent());
        System.out.println(editor.getTitle());
        System.out.println(editor.getTool());
    }
}
