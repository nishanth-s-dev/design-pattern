package com.nishanth.designpattern.behavioural.memento;

public class EditorState {
    private final String content;
    private final String title;
    private final String tool;

    public EditorState(String content, String title, String tool) {
        this.content = content;
        this.title = title;
        this.tool = tool;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getTool() {
        return tool;
    }
}
