package com.nishanth.designpattern.behavioural.memento;

import java.util.Stack;

public class History {
    private final Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }

    public boolean isHistoryEmpty() {
        return states.isEmpty();
    }
}
