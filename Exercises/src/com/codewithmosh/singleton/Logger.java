package com.codewithmosh.singleton;

public class Logger {
    private String fileName;
    private static Logger instance;

    public static Logger getInstance(){
        if(instance!=null){
            return instance;
        }else{
            instance = new Logger();
            return instance;
        }
    }
    private Logger(){}

    public Logger(String fileName) {
        getInstance().fileName = fileName;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }
}
