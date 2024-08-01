package com.nishanth.designpattern.behavioural.mediator.form;

import com.nishanth.designpattern.behavioural.mediator.ui.Button;
import com.nishanth.designpattern.behavioural.mediator.ui.DialogBox;

public class SaveButton extends Button {
    public SaveButton(DialogBox owner) {
        super(owner);
    }
}
