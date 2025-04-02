package com.example.demo.exception;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {
    private final Errors error;

    public ApplicationException(Errors error) {
        super(error.getMessage());
        this.error = error;
    }

    public Errors getError() {
        return error;
    }
}
