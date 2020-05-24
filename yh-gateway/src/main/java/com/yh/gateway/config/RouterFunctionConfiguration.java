package com.yh.gateway.config;

import com.yh.gateway.handler.HystrixFallbackHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import com.yh.gateway.handler.ImageCodeHandler;

/**
 * 路由配置信息
 *
 * @author 洋芋-Sir
 */
@Configuration
public class RouterFunctionConfiguration {
    @Autowired
    private HystrixFallbackHandler hystrixFallbackHandler;

    @Autowired
    private ImageCodeHandler imageCodeHandler;

    @SuppressWarnings("rawtypes")
    @Bean
    public RouterFunction routerFunction() {
        return RouterFunctions
                .route(RequestPredicates.path("/fallback").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        hystrixFallbackHandler)
                .andRoute(RequestPredicates.GET("/code").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        imageCodeHandler);
    }

}
