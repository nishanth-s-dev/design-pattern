package com.nishanth.designpattern.behavioural.command;

import com.nishanth.designpattern.behavioural.command.composite.BlackAndWhiteImageFilterCommandImpl;
import com.nishanth.designpattern.behavioural.command.composite.CompositeCommand;
import com.nishanth.designpattern.behavioural.command.composite.ResizeImageCommand;
import com.nishanth.designpattern.behavioural.command.framework.Button;
import com.nishanth.designpattern.behavioural.command.framework.Command;

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
    }
}
