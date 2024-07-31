package com.nishanth.designpattern.behavioural.command.framework;

public class Button {
    private String label;

    public void click(Command command) {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
