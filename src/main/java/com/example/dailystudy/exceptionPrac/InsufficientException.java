package com.example.dailystudy.exceptionPrac;

public class InsufficientException extends Exception{
    public InsufficientException(){

    }

    public InsufficientException(String message) {
        super(message);
    }
}
