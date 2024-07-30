package com.nishanth.designpattern.behavioural.memento;

import java.util.Stack;

public class History {
    private final Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        if (!states.isEmpty()) {
            return states.pop();
        } else {
            System.out.println("Undo limit reached");
        }
        return null;
    }

    public boolean isHistoryEmpty() {
        return states.isEmpty();
    }
}
