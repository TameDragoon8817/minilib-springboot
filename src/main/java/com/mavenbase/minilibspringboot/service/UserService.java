package com.mavenbase.minilibspringboot.service;

import com.mavenbase.minilibspringboot.pojo.User;

public interface UserService {
    User queryUserByName(String name);
}
