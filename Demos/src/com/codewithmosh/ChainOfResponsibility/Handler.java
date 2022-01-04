package com.codewithmosh.ChainOfResponsibility;

public abstract class Handler {
    private Handler next;
    public Handler(Handler next) {
        this.next = next;
    }
    public abstract boolean doHandle(HttpRequest request);

    public void handle(HttpRequest request){
        if(doHandle(request)){

         return;

        }
        if (next != null){
            
            next.handle(request);
        }
    }
}
