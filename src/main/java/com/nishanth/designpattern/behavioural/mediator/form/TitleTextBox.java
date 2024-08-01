package com.nishanth.designpattern.behavioural.mediator.form;

import com.nishanth.designpattern.behavioural.mediator.ui.TextBox;

public class TitleTextBox extends TextBox {
    private SaveButton saveButton;

    public TitleTextBox(SaveButton saveButton) {
        this.saveButton = saveButton;
    }

    @Override
    public void setContent(String content) {
        super.setContent(content);
        changed();
    }

    private void changed() {
        saveButton.setEnabled(getContent() != null);
    }
}
