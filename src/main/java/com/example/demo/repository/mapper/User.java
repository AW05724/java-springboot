package com.example.demo.repository.mapper;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
    private int id;
    private String mail;
    private String password;
    private String roles;
    private LocalDateTime created;
    private LocalDateTime lastLogined;
    private boolean enabled;
}