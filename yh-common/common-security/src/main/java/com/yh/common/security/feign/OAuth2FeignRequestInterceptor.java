package com.yh.common.security.feign;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Component;
import com.yh.common.core.constant.SecurityConstants;
import com.yh.common.core.utils.StringUtils;
import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * feign请求拦截器
 *
 * @author 洋芋-Sir
 */
@Component
public class OAuth2FeignRequestInterceptor implements RequestInterceptor {
    private final String AUTHORIZATION_HEADER = "Authorization";

    private final String BEARER_TOKEN_TYPE = "Bearer";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        Collection<String> fromHeader = requestTemplate.headers().get(SecurityConstants.FROM);
        if (StringUtils.isNotEmpty(fromHeader) && fromHeader.contains(SecurityConstants.FROM_IN)) {
            return;
        }
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        if (authentication != null && authentication.getDetails() instanceof OAuth2AuthenticationDetails) {
            OAuth2AuthenticationDetails dateils = (OAuth2AuthenticationDetails) authentication.getDetails();
            requestTemplate.header(AUTHORIZATION_HEADER,
                    String.format("%s %s", BEARER_TOKEN_TYPE, dateils.getTokenValue()));
        }
    }
}