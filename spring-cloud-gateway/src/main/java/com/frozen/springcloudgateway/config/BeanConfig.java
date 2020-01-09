package com.frozen.springcloudgateway.config;

import brave.sampler.Sampler;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Frozen
 * @create: 2019-12-18 19:43
 * @description:
 **/
@Configuration
public class BeanConfig {
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/get")
						.filters(f -> f.addRequestHeader("Hello", "World"))
						.uri("http://httpbin.org:80"))
				.build();
	}
}
