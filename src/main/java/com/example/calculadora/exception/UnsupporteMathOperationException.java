package com.example.calculadora.exception;

public class UnsupporteMathOperationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UnsupporteMathOperationException(String message) {
        super(message);
    }
}
