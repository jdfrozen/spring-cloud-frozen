package com.frozen.springcloudclientfeign.controller;

import com.frozen.springcloudclientfeign.service.SchedualServiceHi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
	SchedualServiceHi schedualServiceHi;


	@RequestMapping(value = "index")
    public String index(){
        return "/index";
    }

	@RequestMapping(value = "hello")
	public String hello(){
		return schedualServiceHi.sayHiFromClientOne( "frozen" );
	}

}
