package com.nishanth.designpattern.behavioural.memento;

import java.util.Stack;

public class Editor {
    private String content;
    private final Stack<String> prevContentStack = new Stack<>();

/*
    Need to add these logics for other properties as well. And it's not maintainable.
    Need to write logic undo logic for these title property as well.

    private String title;
    private final Stack<String> prevTitleStack = new Stack<>();

    public void undoTitle() { ... }
*/

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (this.content != null) {
            prevContentStack.push(this.content);
        }
        this.content = content;
    }

    public void undoContent() {
        if (!prevContentStack.isEmpty()) {
            content = prevContentStack.pop();
        }
    }
}
