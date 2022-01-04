package com.codewithmosh.Command.Commands;
import com.codewithmosh.Command.Fx.Command;
import com.codewithmosh.Command.Services.CustomerService;

public class AddCustomerCommand implements Command {
    private CustomerService service;
    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }
    @Override
    public void execute() {
        service.addCustomer();
    }
    
}
