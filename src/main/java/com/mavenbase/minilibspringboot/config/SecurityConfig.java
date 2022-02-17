package com.mavenbase.minilibspringboot.config;

import com.mavenbase.minilibspringboot.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/book").hasRole("root")
                .antMatchers("/book").hasRole("user")
                .antMatchers("/book").hasRole("administrators");
        http.formLogin();
        http.logout().logoutSuccessUrl("/");
//        http.csrf().disable();
        http.rememberMe().rememberMeParameter("remember");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }
}
