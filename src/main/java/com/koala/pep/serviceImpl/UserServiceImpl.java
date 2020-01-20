package com.koala.pep.serviceImpl;

import com.koala.pep.mapper.UserMapper;
import com.koala.pep.model.User;
import com.koala.pep.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByPk(String pk_user) {
        return userMapper.getUserByPk(pk_user);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.getAllUsers();
    }

}
