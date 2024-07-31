package com.nishanth.designpattern.behavioural.command.composite;

import com.nishanth.designpattern.behavioural.command.framework.Command;

public class ResizeImageCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize Image");
    }
}
