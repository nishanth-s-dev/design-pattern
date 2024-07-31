package com.nishanth.designpattern.behavioural.command.undoable.command;

import com.nishanth.designpattern.behavioural.command.undoable.History;

public class UndoCommand implements Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (!history.isEmpty()) {
            UndoableCommand lastCommand = history.pop();
            lastCommand.unexecute();
        }
    }
}
