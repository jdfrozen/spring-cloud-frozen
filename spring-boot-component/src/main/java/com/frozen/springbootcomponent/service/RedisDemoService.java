package com.frozen.springbootcomponent.service;

import com.frozen.springbootcomponent.dao.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Frozen
 * @create: 2020-02-06 12:03
 * @description:
 **/
@Service
public class RedisDemoService {
	@Autowired
	RedisUtil redisUtil;

	public String helloWord(){
		String key = "frozen";
		redisUtil.set(key,"success");
		return (String) redisUtil.get(key);
	}
}
