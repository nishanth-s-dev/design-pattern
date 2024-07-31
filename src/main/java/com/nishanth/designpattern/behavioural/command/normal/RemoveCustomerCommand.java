package com.nishanth.designpattern.behavioural.command.normal;

import com.nishanth.designpattern.behavioural.command.framework.Command;

public class RemoveCustomerCommand implements Command {
    private CustomerService customerService;

    public RemoveCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.removeCustomer();
    }
}
