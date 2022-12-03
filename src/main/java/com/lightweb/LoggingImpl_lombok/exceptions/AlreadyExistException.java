package com.lightweb.LoggingImpl_lombok.exceptions;

public class AlreadyExistException extends RuntimeException{

    private String message;

    public AlreadyExistException(){
        super("Already exist ");
        this.message = "Already exist";
    }

    public AlreadyExistException(String msg){
        super(msg);
        this.message = msg;
    }
}