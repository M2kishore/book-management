package com.example.bookmanagement.error;

public class BookNotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}