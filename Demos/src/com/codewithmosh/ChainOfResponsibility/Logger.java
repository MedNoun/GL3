package com.codewithmosh.ChainOfResponsibility;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
        //TODO Auto-generated constructor stub
    }


    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("logging !");
        return false;
    }
    
}
