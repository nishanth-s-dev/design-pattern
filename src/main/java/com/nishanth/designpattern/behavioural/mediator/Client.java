package com.nishanth.designpattern.behavioural.mediator;

import com.nishanth.designpattern.behavioural.mediator.form.ArticlesListBox;
import com.nishanth.designpattern.behavioural.mediator.form.SaveButton;
import com.nishanth.designpattern.behavioural.mediator.form.TitleTextBox;

public class Client {
    public static void main(String[] args) {
        SaveButton saveButton = new SaveButton();
        TitleTextBox titleTextBox = new TitleTextBox(saveButton);
        ArticlesListBox articlesListBox = new ArticlesListBox(saveButton, titleTextBox);

        // Both will enable button
        titleTextBox.setContent("something.txt");
        // OR
        articlesListBox.changed();

        saveButton.clicked();
    }
}
