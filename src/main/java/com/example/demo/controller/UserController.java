package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;
import com.example.demo.repository.mapper.User;

import java.time.LocalDateTime;
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
    public User getUserById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @PostMapping("/users/update")
    public ResponseEntity<String> updateUser(
            @RequestParam("id") int id,
            @RequestHeader("mail") String mail,
            @RequestHeader("password") String password,
            @RequestHeader("roles") String roles,
            @RequestHeader("enabled") boolean enabled
    ) {
        User user = User.builder()
                .mail(mail)
                .password(password)
                .roles(roles)
                .enabled(enabled)
                .lastLogined(LocalDateTime.now())
                .build();
        userRepository.update(id, user);
        return ResponseEntity.ok("User updated successfully");
    }

    @PostMapping("/users/create")
    public ResponseEntity<String> createUser(
            @RequestHeader("mail") String mail,
            @RequestHeader("password") String password,
            @RequestHeader("roles") String roles,
            @RequestHeader("enabled") boolean enabled
    ) {
        User user = User.builder()
                .mail(mail)
                .password(password)
                .roles(roles)
                .enabled(enabled)
                .created(LocalDateTime.now())
                .lastLogined(LocalDateTime.now())
                .build();
        userRepository.insert(user);
        return ResponseEntity.ok("User created successfully");
    }
}
