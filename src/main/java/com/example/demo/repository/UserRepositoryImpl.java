package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.exception.ApplicationException;
import com.example.demo.repository.mapper.User;
import com.example.demo.repository.mapper.UserMapper;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;


    public List<User> findAll() {
        try {
            return userMapper.findAll();
        } catch (DataAccessException e){
            System.err.println("findAll error:" + e.getMessage());
            throw new ApplicationException("failed to retrieve all users." , e);
        }
    }

    public User findById(Integer id) {
        try {
            return userMapper.findById(id);
        } catch (DataAccessException e){
            System.err.println("findById error:" + e.getMessage());
            throw new ApplicationException("Failed to retrieve user by ID: " + id, e);
        }
    }

    public void update(Integer id, User user) {
        try {
            userMapper.update(id, user);
        } catch (DataAccessException e) {
            System.err.println("update error: " + e.getMessage());
            throw new ApplicationException("Failed to update user with ID: " + id, e);
        }
    }
    public void insert(User user) {
        try {
            userMapper.insert(user);
        } catch (DataAccessException e) {
            System.err.println("insert error: " + e.getMessage());
            throw new ApplicationException("Failed to insert user.", e);
        }
    }
}
