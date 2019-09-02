package com.mock.librarysecond.exceptions;

public class ServerErrorException extends RuntimeException{
    public ServerErrorException(String message){
        super(message);
    }
}