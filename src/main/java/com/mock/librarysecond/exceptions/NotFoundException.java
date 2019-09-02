package com.mock.librarysecond.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message)
    {
        super(message);
    }
}