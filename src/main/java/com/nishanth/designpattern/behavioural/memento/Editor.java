package com.nishanth.designpattern.behavioural.memento;

public class Editor {
    private String content;
    private String prevContent;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        prevContent = this.content != null ? this.content : null;
        this.content = content;
    }

    public void undoContent() {
        content = prevContent != null ? prevContent : content;
    }
}
