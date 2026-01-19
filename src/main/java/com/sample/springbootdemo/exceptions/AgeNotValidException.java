package com.sample.springbootdemo.exceptions;

public class AgeNotValidException extends RuntimeException{
    public AgeNotValidException(String message) {
        super(message);
    }
}
