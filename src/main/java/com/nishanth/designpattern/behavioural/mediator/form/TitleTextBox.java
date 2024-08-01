package com.nishanth.designpattern.behavioural.mediator.form;

import com.nishanth.designpattern.behavioural.mediator.ui.DialogBox;
import com.nishanth.designpattern.behavioural.mediator.ui.TextBox;

public class TitleTextBox extends TextBox {
    public TitleTextBox(DialogBox owner) {
        super(owner);
    }
}
