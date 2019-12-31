package com.test.service;

import com.test.entity.User;

import java.util.List;

public interface IUserService {
    List<User> selectAll();

    List<User> selectBySelective(User user);

    int insertBySelective(User user);

    List<User> selectById(long id);
}
