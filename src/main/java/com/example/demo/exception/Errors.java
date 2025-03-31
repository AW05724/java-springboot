package com.example.demo.exception;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Errors {
    INVALID_REQUEST("E0001", "invalid request.", HttpStatus.BAD_REQUEST),
    DB_ERROR("E1000", "db error.", HttpStatus.INTERNAL_SERVER_ERROR),
    INTERNAL_SERVER_ERROR("E9999", "internal server error.", HttpStatus.INTERNAL_SERVER_ERROR),
    ;

    private final String code;
    private final String message;
    private final HttpStatus status;

    @JsonValue
    @Override
    public String toString() {
        return "code:" + this.code + " message:" + this.message;
    }
}
