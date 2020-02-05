package com.frozen.springbootcomponent.controller;

import com.frozen.springbootcomponent.po.User;
import com.frozen.springbootcomponent.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Frozen
 * @create: 2019-08-28 10:01
 * @description: 用户
 **/
@Controller
@RequestMapping("/safety")
@Slf4j
public class RedisController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/frozen")
    @ResponseBody
    public String getAllUser(){
        List<User> list = userService.getAllUser();
        log.info("allUser={}", Arrays.toString(list.toArray()));
        return Arrays.toString(list.toArray());
    }

}