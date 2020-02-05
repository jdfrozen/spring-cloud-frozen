package com.frozen.springbootcomponent.controller;

import com.frozen.springbootcomponent.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Frozen
 * @create: 2019-08-28 10:01
 * @description: 用户
 **/
@RestController
@RequestMapping(value = "/safety")
@Slf4j
public class HtmlController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/index")
    public String getAllUser(){
        return "index";
    }

}
