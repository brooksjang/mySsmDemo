package com.test.service.serviceImpl;

import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public List<User> selectBySelective(User user) {
        return userDao.selectBySelective(user);
    }

    @Override
    public int insertBySelective(User user) {
        return userDao.insertBySelective(user);
    }

    @Override
    public List<User> selectById(long id) {
        return userDao.selectById(id);
    }
}
