package com.frozen.springcloudserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Frozen
 * @create: 2019-08-23 13:59
 * @description:
 **/
@RestController
@Slf4j
public class IndexController {

	@Value("${server.port}")
	String port;

    @RequestMapping(value = "index")
    public String index(){
        return "/index";
    }

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}

}
