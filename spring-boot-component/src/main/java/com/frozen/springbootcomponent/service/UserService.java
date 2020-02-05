package com.frozen.springbootcomponent.service;

import com.frozen.springbootcomponent.dao.UserMapper;
import com.frozen.springbootcomponent.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: frozen
 * @Date: 2019/4/21 08:27
 * @Description:
 */
@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

    public User getByUsername(String username) {
        User user = new User();
        user.setEnabled(true);
        //PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //user.setPassword(passwordEncoder.encode("123456"));
        user.setPassword("123456");
        return user;
    }

    public List<User> getAllUser(){
	   return userMapper.getAllUser();
    }
}
