package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;
import com.example.demo.repository.mapper.User;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userRepository.findById(id);
    }
}
