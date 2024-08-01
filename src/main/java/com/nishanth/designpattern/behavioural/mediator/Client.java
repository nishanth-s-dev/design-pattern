package com.nishanth.designpattern.behavioural.mediator;

import com.nishanth.designpattern.behavioural.mediator.form.ArticlesDialogBox;

public class Client {
    public static void main(String[] args) {
        ArticlesDialogBox articlesDialogBox = new ArticlesDialogBox();

        articlesDialogBox.simulateUserInteration();
        articlesDialogBox.simulateUserInterationUsingTitleTextBox();

        articlesDialogBox.simulateUserInterationEmptyTitleContent();
    }
}
