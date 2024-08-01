package com.nishanth.designpattern.behavioural.mediator.form;

import com.nishanth.designpattern.behavioural.mediator.ui.Button;

public class SaveButton extends Button {
    public void clicked() {
        if (isEnabled()) {
            System.out.println("Updating database");
        } else {
            System.out.println("button disabled");
        }
    }
}
