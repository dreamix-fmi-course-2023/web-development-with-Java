package com.fmi.exceptions;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg) {
        super(msg);
    }

    public InvalidAgeException(Throwable e) {
        super(e);
    }
}

