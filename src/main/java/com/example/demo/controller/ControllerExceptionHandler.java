package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import lombok.extern.slf4j.Slf4j;

import com.example.demo.exception.ApplicationException;
import com.example.demo.exception.Errors;

@Slf4j
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Errors> unhandledException(Exception ex) {
        log.error("unhandled Exception:" + ex.getMessage(), ex);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Errors.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({ ApplicationException.class })
    public ResponseEntity<Errors> handleApplicationException(ApplicationException ex) {
        log.warn("application exception. " + ex.getError().toString() + ", message: " + ex.getMessage());
        return ResponseEntity.status(ex.getError().getStatus()).body(ex.getError());
    }
}
