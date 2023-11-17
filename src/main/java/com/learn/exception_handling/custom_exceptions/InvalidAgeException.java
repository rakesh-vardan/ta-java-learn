package com.learn.exception_handling.custom_exceptions;

public class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
