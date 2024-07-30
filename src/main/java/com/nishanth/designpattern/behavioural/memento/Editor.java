package com.nishanth.designpattern.behavioural.memento;

import java.util.Stack;

public class Editor {
    private String content;
    private String title;


    public EditorState createState() {
        return new EditorState(content, title);
    }

    public void restore(EditorState editorState) {
        if (editorState != null) {
            this.content = editorState.getContent();
            this.title = editorState.getTitle();
        }
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
