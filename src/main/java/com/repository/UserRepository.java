package com.repository;

import java.util.List;

public interface UserRepository {

    List<UserRepositoryImpl> findAll();

    UserRepositoryImpl findById(Integer id);
}
