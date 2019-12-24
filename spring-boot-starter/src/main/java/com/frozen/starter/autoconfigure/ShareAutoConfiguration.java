package com.frozen.starter.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ShareProperties.class)
public class ShareAutoConfiguration {

	@Bean
	public ShareDemo getShareDemo(ShareProperties shareProperties) {
		ShareDemo shareDemo = new ShareDemo();
		shareDemo.setName(shareProperties.getName());
		shareDemo.setUrl(shareProperties.getUrl());
		return shareDemo;
	}
}
