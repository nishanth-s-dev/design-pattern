package com.nishanth.designpattern.behavioural.command.composite;

import com.nishanth.designpattern.behavioural.command.framework.Command;

import java.util.LinkedList;
import java.util.List;

public class CompositeCommand implements Command {
    private final List<Command> commands = new LinkedList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
