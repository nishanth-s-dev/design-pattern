package com.nishanth.designpattern.behavioural.command.undoable;

import com.nishanth.designpattern.behavioural.command.undoable.command.UndoableCommand;

import java.util.Stack;

public class History {
    Stack<UndoableCommand> history = new Stack<>();

    public void push(UndoableCommand command) {
        history.push(command);
    }

    public UndoableCommand pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
