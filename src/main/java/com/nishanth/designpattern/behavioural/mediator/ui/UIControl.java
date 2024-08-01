package com.nishanth.designpattern.behavioural.mediator.ui;

public class UIControl {
    protected final DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
