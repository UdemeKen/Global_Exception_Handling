package com.lightweb.LoggingImpl_lombok.exceptions;

public class NotFoundExceptions extends RuntimeException{

    private String message;

    public NotFoundExceptions(){
        super("Not Found");
        this.message ="Not Found";
    }
    public NotFoundExceptions(String msg){
        super(msg);
        this.message = msg;
    }
}