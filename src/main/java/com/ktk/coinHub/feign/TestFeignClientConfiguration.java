package com.ktk.coinHub.feign;

import org.springframework.context.annotation.Bean;

import feign.Logger;

public class TestFeignClientConfiguration {
	@Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
