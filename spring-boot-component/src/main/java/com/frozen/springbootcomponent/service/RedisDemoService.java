package com.frozen.springbootcomponent.service;

import com.frozen.springbootcomponent.dao.redis.RedisDao;
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
	RedisDao redisDao;

	public String helloWord(){
		String key = "frozen";
		redisDao.set(key,"success");
		return (String) redisDao.get(key);
	}
}
