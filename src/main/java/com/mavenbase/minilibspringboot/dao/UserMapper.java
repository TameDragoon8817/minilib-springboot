package com.mavenbase.minilibspringboot.dao;

import com.mavenbase.minilibspringboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    User queryUserByName(String name);
}