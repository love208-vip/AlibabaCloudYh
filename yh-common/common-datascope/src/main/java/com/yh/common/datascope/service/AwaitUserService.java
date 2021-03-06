package com.yh.common.datascope.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yh.common.core.constant.SecurityConstants;
import com.yh.common.core.domain.R;
import com.yh.common.core.utils.StringUtils;
import com.yh.common.security.utils.SecurityUtils;
import com.yh.system.api.RemoteUserService;
import com.yh.system.api.model.UserInfo;

/**
 * 同步调用用户服务
 *
 * @author 洋芋-Sir
 */
@Service
public class AwaitUserService {
    private static final Logger log = LoggerFactory.getLogger(AwaitUserService.class);

    @Autowired
    private RemoteUserService remoteUserService;

    /**
     * 查询当前用户信息
     *
     * @return 用户基本信息
     */
    public UserInfo info() {
        String username = SecurityUtils.getUsername();
        R<UserInfo> userResult = remoteUserService.info(username, SecurityConstants.FROM_IN);
        if (StringUtils.isNull(userResult) || StringUtils.isNull(userResult.getData())) {
            log.info("数据权限范围查询用户：{} 不存在.", username);
            return null;
        }
        return userResult.getData();
    }
}
