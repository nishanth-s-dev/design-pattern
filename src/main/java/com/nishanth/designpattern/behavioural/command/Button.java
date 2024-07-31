package com.nishanth.designpattern.behavioural.command;

public class Button {
    private String label;

    public void click() {
        // This method should behave different, based on who is and where is used.
        // Decided at run time. Like if user want to add, edit or delete customer. This should behave differently.
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
