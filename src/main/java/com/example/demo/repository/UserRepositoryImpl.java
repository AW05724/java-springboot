package com.example.demo.repository;

import com.example.demo.exception.ApplicationException;
import com.example.demo.exception.Errors;
import com.example.demo.repository.mapper.User;
import com.example.demo.repository.mapper.UserMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        try {
            return userMapper.findAll();
        } catch (DataAccessException e) {
            System.err.println("findAll error:" + e.getMessage());
            throw new ApplicationException(Errors.DB_ERROR, e);
        }
    }

    public User findById(Integer id) {
        try {
            User user = userMapper.findById(id);
            if (user == null) {
                throw new ApplicationException(Errors.INVALID_REQUEST); // 該当データなしは不正なリクエストと解釈
            }
            return user;
        } catch (DataAccessException e) {
            System.err.println("findById error:" + e.getMessage());
            throw new ApplicationException(Errors.DB_ERROR, e);
        }
    }

    public void update(Integer id, User user) {
        try {
            int rowsAffected = userMapper.update(id, user);
            if (rowsAffected == 0) {
                throw new ApplicationException(Errors.INVALID_REQUEST);
            }
        } catch (DataAccessException e) {
            System.err.println("update error: " + e.getMessage());
            throw new ApplicationException(Errors.DB_ERROR, e);
        }
    }

    public void insert(User user) {
        try {
            userMapper.insert(user);
        } catch (DataAccessException e) {
            System.err.println("insert error: " + e.getMessage());
            throw new ApplicationException(Errors.DB_ERROR, e);
        }
    }
}
