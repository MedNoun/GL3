package com.codewithmosh.ChainOfResponsibility;

public class WebServer {
    private Handler handler;
    public WebServer(Handler h){
        handler = h;
    }
    public void handle(HttpRequest request){
        handler.handle(request);
    }   
    
}
