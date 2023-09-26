package com.danielalderete.fashionlike.core.exceptions;

public class InvalidAuthorException extends RuntimeException {
    public InvalidAuthorException() {
        super(ExceptionMessages.INVALID_AUTHOR);
    }
}
