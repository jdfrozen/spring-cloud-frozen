package com.frozen.springcloudclientribbon.controller;

import com.frozen.springcloudclientribbon.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Frozen
 * @create: 2019-08-23 13:59
 * @description:
 **/
@RestController
@Slf4j
public class IndexController {

	@Autowired
	HelloService helloService;

    @RequestMapping(value = "index")
    public String index(){
        return "/index";
    }

	@RequestMapping(value = "hello")
	public String hello(){
		return helloService.hiService("frozen");
	}

}
