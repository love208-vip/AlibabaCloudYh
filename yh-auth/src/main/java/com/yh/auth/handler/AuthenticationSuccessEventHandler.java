package com.yh.auth.handler;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.yh.common.core.utils.ServletUtils;
import com.yh.common.security.domain.LoginUser;
import com.yh.common.security.handler.AbstractAuthenticationSuccessEventHandler;

/**
 * 认证成功处理
 *
 * @author 洋芋-Sir
 */
@Component
public class AuthenticationSuccessEventHandler extends AbstractAuthenticationSuccessEventHandler {
    private final Logger logger = LoggerFactory.getLogger(AuthenticationSuccessEventHandler.class);

    @Override
    public void handle(Authentication authentication) {
        HttpServletRequest request = ServletUtils.getRequest();

        String url = request.getRequestURI();

        if (authentication.getPrincipal() instanceof LoginUser) {
            LoginUser user = (LoginUser) authentication.getPrincipal();

            String username = user.getUsername();

            logger.info("用户：{} 授权成功，url：{}", username, url);
        }
    }
}
