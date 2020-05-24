package com.yh.system.api;

import com.yh.system.api.model.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import com.yh.common.core.constant.SecurityConstants;
import com.yh.common.core.constant.ServiceNameConstants;
import com.yh.common.core.domain.R;
import com.yh.system.api.factory.RemoteUserFallbackFactory;

/**
 * 用户服务
 *
 * @author 洋芋-Sir
 */
@FeignClient(contextId = "remoteUserService", value = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService {
    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @param from     调用标志
     * @return 结果
     */
    @GetMapping(value = "/user/info/{username}")
    public R<UserInfo> info(@PathVariable("username") String username,
                            @RequestHeader(SecurityConstants.FROM) String from);
}
