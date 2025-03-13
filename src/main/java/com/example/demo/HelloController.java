package com.example.demo;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
  
  @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
