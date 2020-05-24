package com.yh.common.security.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import com.yh.common.core.utils.StringUtils;

/**
 * 认证成功事件处理器
 *
 * @author 洋芋-Sir
 */
public abstract class AbstractAuthenticationSuccessEventHandler
        implements ApplicationListener<AuthenticationSuccessEvent> {
    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        Authentication authentication = (Authentication) event.getSource();
        if (StringUtils.isNotEmpty(authentication.getAuthorities())) {
            handle(authentication);
        }
    }

    /**
     * 处理登录成功方法
     */
    public abstract void handle(Authentication authentication);
}
