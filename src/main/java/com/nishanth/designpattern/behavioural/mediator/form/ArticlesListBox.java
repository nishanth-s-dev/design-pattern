package com.nishanth.designpattern.behavioural.mediator.form;

import com.nishanth.designpattern.behavioural.mediator.ui.ListBox;

public class ArticlesListBox extends ListBox {
    private final SaveButton saveButton;
    private final TitleTextBox titleTextBox;

    public ArticlesListBox(SaveButton saveButton, TitleTextBox titleTextBox) {
        this.saveButton = saveButton;
        this.titleTextBox = titleTextBox;
    }

    public void changed() {
        titleTextBox.setContent("filename");
    }
}
