package com.example.demo.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(Integer id);
}
