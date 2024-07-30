package com.nishanth.designpattern.behavioural.memento;

import java.util.Stack;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState editorState) {
        this.content = editorState.getContent();
    }
}
