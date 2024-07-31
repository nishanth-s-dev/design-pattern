package com.nishanth.designpattern.behavioural.command.undoable.command;

public interface UndoableCommand extends Command {
    void unexecute();
}
