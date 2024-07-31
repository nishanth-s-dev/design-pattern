package com.nishanth.designpattern.behavioural.command;

import com.nishanth.designpattern.behavioural.command.composite.BlackAndWhiteImageFilterCommandImpl;
import com.nishanth.designpattern.behavioural.command.composite.CompositeCommand;
import com.nishanth.designpattern.behavioural.command.composite.ResizeImageCommand;
import com.nishanth.designpattern.behavioural.command.framework.Button;
import com.nishanth.designpattern.behavioural.command.framework.Command;
import com.nishanth.designpattern.behavioural.command.normal.AddCustomerCommand;
import com.nishanth.designpattern.behavioural.command.normal.CustomerService;
import com.nishanth.designpattern.behavioural.command.normal.RemoveCustomerCommand;
import com.nishanth.designpattern.behavioural.command.undoable.*;
import com.nishanth.designpattern.behavioural.command.undoable.command.BoldCommand;
import com.nishanth.designpattern.behavioural.command.undoable.command.UndoCommand;
import com.nishanth.designpattern.behavioural.command.undoable.command.UndoableCommand;

public class Client {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Command addCustomerCommand = new AddCustomerCommand(customerService);
        Command removeCustomerCommand = new RemoveCustomerCommand(customerService);

        Button button = new Button();
        button.click(addCustomerCommand);
        button.click(removeCustomerCommand);

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(new BlackAndWhiteImageFilterCommandImpl());
        compositeCommand.addCommand(new ResizeImageCommand());

        button.click(compositeCommand);

        History history = new History();
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.setContent("Hello World");

        UndoableCommand boldCommand = new BoldCommand(htmlDocument, history);
        boldCommand.execute();

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(htmlDocument.getContent());
    }
}
