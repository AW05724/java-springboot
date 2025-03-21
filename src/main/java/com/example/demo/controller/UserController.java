package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    public String updateUser(
            @RequestParam("id") Integer id,
            @RequestHeader("mail") String mail,
            @RequestHeader("password") String password,
            @RequestHeader("roles") String roles,
            @RequestHeader("enabled") String enabled
    ) {
        User user = new User();
        user.setMail(mail);
        user.setPassword(password);
        user.setRoles(roles);
        user.setEnabled(Boolean.parseBoolean(enabled));
        user.setLastLogined(LocalDateTime.now());
        userRepository.update(id, user);
        return "User updated successfully";
    }

    @PostMapping("/users/create")
    public String createUser(
            @RequestHeader("mail") String mail,
            @RequestHeader("password") String password,
            @RequestHeader("roles") String roles,
            @RequestHeader("enabled") String enabled
    ) {
        User user = new User();
        user.setMail(mail);
        user.setPassword(password);
        user.setRoles(roles);
        user.setEnabled(Boolean.parseBoolean(enabled));
        user.setCreated(LocalDateTime.now());
        userRepository.insert(user);
        return "User created successfully";
    }
}
