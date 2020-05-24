package com.yh.common.security.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.RequestInterceptor;

/**
 * Feign配置注册
 *
 * @author 洋芋-Sir
 **/
@Configuration
public class OAuth2FeignConfig {
    @Bean
    public RequestInterceptor requestInterceptor() {
        return new OAuth2FeignRequestInterceptor();
    }
}
