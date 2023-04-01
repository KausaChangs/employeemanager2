package com.example.emoloyeemanager.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {

        super(message);
    }

}
