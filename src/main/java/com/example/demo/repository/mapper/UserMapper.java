package com.example.demo.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(int id);
    void update(@Param("id") int id, @Param("user") User user);
    void insert(@Param("user")User user);
} 
