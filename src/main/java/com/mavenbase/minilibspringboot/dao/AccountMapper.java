package com.mavenbase.minilibspringboot.dao;

import com.mavenbase.minilibspringboot.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AccountMapper {
    Account getAccount(String username);
}
