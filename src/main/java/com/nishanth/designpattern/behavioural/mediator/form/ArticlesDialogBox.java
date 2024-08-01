package com.nishanth.designpattern.behavioural.mediator.form;

import com.nishanth.designpattern.behavioural.mediator.ui.DialogBox;
import com.nishanth.designpattern.behavioural.mediator.ui.UIControl;

public class ArticlesDialogBox extends DialogBox {
    private final ArticlesListBox articlesListBox = new ArticlesListBox(this);
    private final TitleTextBox titleTextBox = new TitleTextBox(this);
    private final SaveButton saveButton = new SaveButton(this);

    public void simulateUserInteration() {
        articlesListBox.setSelection("Article 1");
        System.out.println("TextBox : " + titleTextBox.getContent());
        System.out.println("Button is enabled? : " + saveButton.isEnabled());
    }

    public void simulateUserInterationUsingTitleTextBox() {
        titleTextBox.setContent("Some new title");
        System.out.println("TextBox : " + titleTextBox.getContent());
        System.out.println("Button is enabled? : " + saveButton.isEnabled());
    }

    public void simulateUserInterationEmptyTitleContent() {
        titleTextBox.setContent("");
        System.out.println("TextBox : " + titleTextBox.getContent());
        System.out.println("Button is enabled? : " + saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl uiControl) {
        if (uiControl == articlesListBox) {
            articleSelected();
        } else if (uiControl == titleTextBox) {
            titleChanged();
        }
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = content == null || content.isEmpty();
        saveButton.setEnabled(!isEmpty);
    }
}
