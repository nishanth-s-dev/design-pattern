package com.nishanth.designpattern.behavioural.command.undoable.command;

import com.nishanth.designpattern.behavioural.command.undoable.History;
import com.nishanth.designpattern.behavioural.command.undoable.HtmlDocument;

public class BoldCommand implements UndoableCommand{
    private String prevContent;
    private final HtmlDocument htmlDocument;
    private final History history;

    public BoldCommand(HtmlDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.push(this);
    }
}
