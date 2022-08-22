package com.djuka.fizzbuzzapi.error;

public class InvalidParameterException extends RuntimeException{

    public InvalidParameterException() {
    }

    public InvalidParameterException(String message) {
        super(message);
    }
}
