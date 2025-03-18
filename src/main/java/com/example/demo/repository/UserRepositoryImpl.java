package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.mapper.User;
import com.example.demo.repository.mapper.UserMapper;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;


    public List<User> findAll() {
        return userMapper.findAll();
    }


    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    public void update(Integer id, User user) {
        userMapper.update(id, user);
    }

    public void insert(User user) {
        userMapper.insert(user);
    }
}
