package com.mavenbase.minilibspringboot.service;

import com.mavenbase.minilibspringboot.dao.AccountMapper;
import com.mavenbase.minilibspringboot.pojo.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    final
    AccountMapper accountMapper;
    final
    PasswordEncoder passwordEncoder;

    public UserDetailsServiceImpl(AccountMapper accountMapper, PasswordEncoder passwordEncoder) {
        this.accountMapper = accountMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Account account = accountMapper.getAccount(name);
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + account.getRole()));
        User user = new User(account.getName(), passwordEncoder.encode(account.getPassword()), authorities);
        System.out.println(user.getUsername() + passwordEncoder.encode(account.getPassword()) + user.getAuthorities());
        return user;
    }
}