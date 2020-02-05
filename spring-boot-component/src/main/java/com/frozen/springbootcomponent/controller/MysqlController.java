package com.frozen.springbootcomponent.controller;

import com.frozen.springbootcomponent.po.User;
import com.frozen.springbootcomponent.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Frozen
 * @create: 2019-08-28 10:01
 * @description: 用户
 **/
@RestController
@RequestMapping(value = "/safety")
@Slf4j
public class MysqlController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getAllUser")
    @ResponseBody
    public String getAllUser(){
        List<User> list = userService.getAllUser();
        log.info("allUser={}", Arrays.toString(list.toArray()));
        return Arrays.toString(list.toArray());
    }

}
