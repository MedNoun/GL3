package com.codewithmosh.ChainOfResponsibility;

public class Authenticator extends Handler {
   
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentificating ! ");
        var isvalid = (request.getUsername()=="admin" && request.getPassword() == "admin"); 
        return !isvalid;
    
    }
    
}
