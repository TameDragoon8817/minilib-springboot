package com.mavenbase.minilibspringboot.service;

import com.mavenbase.minilibspringboot.dao.UserMapper;
import com.mavenbase.minilibspringboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}