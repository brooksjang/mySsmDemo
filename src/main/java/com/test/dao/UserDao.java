package com.test.dao;

import com.test.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    // 全查询
    List<User> selectAll();

    // 根据条件查询
    List<User> selectBySelective(@Param("user") User user);

    // 添加
    int insertBySelective(@Param("user")User user);

    //按照主键查询
    List<User> selectById(long id);
}
