package com.nishanth.designpattern.behavioural.memento;

import java.util.Stack;

public class Editor {
    private String content;
    private String title;
    private String tool;


    public EditorState createState() {
        return new EditorState(content, title, tool);
    }

    public void restore(EditorState editorState) {
        if (editorState != null) {
            this.content = editorState.getContent();
            this.title = editorState.getTitle();
            this.tool = editorState.getTool();
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

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getTool() {
        return tool;
    }
}
