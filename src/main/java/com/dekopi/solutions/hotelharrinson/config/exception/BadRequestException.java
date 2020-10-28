package com.dekopi.solutions.hotelharrinson.config.exception;

public class BadRequestException extends RuntimeException {

    public BadRequestException() {
        super("Bad Request");
    }

    public BadRequestException(String message) {
        super("Bad Request: " + message);
    }
}
