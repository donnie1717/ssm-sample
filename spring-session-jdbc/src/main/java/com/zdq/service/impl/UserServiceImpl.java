package com.zdq.service.impl;

import com.zdq.dao.UserMapper;
import com.zdq.entity.UserEntity;
import com.zdq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity findUserById(int id) {
        return userMapper.findById(id);
    }
}
