package com.frozen.springcloudclientfeign.service;

import org.springframework.stereotype.Component;

/**
 * @author: Frozen
 * @create: 2019-12-21 12:00
 * @description:
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}

