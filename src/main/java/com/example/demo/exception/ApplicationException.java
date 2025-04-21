package com.example.demo.exception;

import org.springframework.dao.DataAccessException;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {
    private final Errors error;

    public ApplicationException(Errors error) {
        super(error.getMessage());
        this.error = error;
    }

    public ApplicationException(Errors error, Throwable cause) {
        super(error.getMessage(), cause);
        this.error = error;
    }

    public Errors getError() {
        return error;
    }
}
