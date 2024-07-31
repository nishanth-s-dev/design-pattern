package com.nishanth.designpattern.behavioural.command.composite;

import com.nishanth.designpattern.behavioural.command.framework.Command;

public class BlackAndWhiteImageFilterCommandImpl implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white image filter");
    }
}
