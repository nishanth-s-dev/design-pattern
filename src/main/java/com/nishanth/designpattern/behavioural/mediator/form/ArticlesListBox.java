package com.nishanth.designpattern.behavioural.mediator.form;

import com.nishanth.designpattern.behavioural.mediator.ui.DialogBox;
import com.nishanth.designpattern.behavioural.mediator.ui.ListBox;

public class ArticlesListBox extends ListBox {
    public ArticlesListBox(DialogBox owner) {
        super(owner);
    }
}
