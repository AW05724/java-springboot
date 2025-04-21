package com.example.demo.repository;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.example.demo.repository.mapper.User;
import com.example.demo.repository.mapper.UserMapper;

@SpringBootTest
public class UserRepositoryImplTest {

    @MockitoBean
    private UserMapper userMapper;

    @Autowired
    private UserRepositoryImpl userRepository;

    private List<User> userList;
    private User user;

    @BeforeEach
    void setUp() {
        userList = new ArrayList<>();
        user = new User();
        user.setId(1);
        userList.add(user);
    }

    @Test
    void findAll_正常系() {
        // UserMapperのfindAll()メソッドが呼ばれたときに、userListを返すように設定
        when(userMapper.findAll()).thenReturn(userList);

        // UserRepositoryImplのfindAll()メソッドを呼び出し、結果をresultに格納
        List<User> result = userRepository.findAll();

        // resultがuserListと一致することを検証
        assertEquals(userList, result);

        // UserMapperのfindAll()メソッドが1回呼ばれたことを検証
        verify(userMapper, times(1)).findAll();
    }
}
