package com.example.demo.repository;

import java.util.List;
import com.example.demo.repository.mapper.User;

public interface UserRepository {

    List<User> findAll();

    User findById(Integer id);
}
