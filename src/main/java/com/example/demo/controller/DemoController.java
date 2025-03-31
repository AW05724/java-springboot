package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ApplicationException;
import com.example.demo.exception.Errors;

@RestController
public class DemoController {

    @GetMapping("/exception")
    public String throwException() {
        throw new RuntimeException("例外が発生しました。");
    }

    @GetMapping("/applicationException")
    public String throwApplicationException() {
        throw new ApplicationException(Errors.INVALID_REQUEST);
    }
}
