package com.nishanth.designpattern.behavioural.mediator.ui;

public class Button extends UIControl {
    private boolean isEnabled = false;

    public Button(DialogBox owner) {
        super(owner);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        owner.changed(this);
    }
}
