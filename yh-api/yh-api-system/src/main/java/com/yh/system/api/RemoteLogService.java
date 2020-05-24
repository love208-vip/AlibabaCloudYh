package com.yh.system.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import com.yh.common.core.constant.SecurityConstants;
import com.yh.common.core.constant.ServiceNameConstants;
import com.yh.common.core.domain.R;
import com.yh.system.api.domain.SysOperLog;
import com.yh.system.api.factory.RemoteLogFallbackFactory;

/**
 * 日志服务
 *
 * @author 洋芋-Sir
 */
@FeignClient(contextId = "remoteLogService", value = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = RemoteLogFallbackFactory.class)
public interface RemoteLogService {
    /**
     * 保存系统日志
     *
     * @param sysOperLog 日志实体
     * @param from       内部调用标志
     * @return 结果
     */
    @PostMapping("/operlog")
    R<Boolean> saveLog(@RequestBody SysOperLog sysOperLog, @RequestHeader(SecurityConstants.FROM) String from);
}
