package com.frozen.springcloudserver.config;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Frozen
 * @create: 2019-12-18 19:43
 * @description:
 **/
@Configuration
public class BeanConfig {
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
