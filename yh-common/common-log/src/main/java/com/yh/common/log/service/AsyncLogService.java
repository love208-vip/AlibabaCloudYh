package com.yh.common.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.yh.common.core.constant.SecurityConstants;
import com.yh.system.api.RemoteLogService;
import com.yh.system.api.domain.SysOperLog;

/**
 * 异步调用日志服务
 *
 * @author 洋芋-Sir
 */
@Service
public class AsyncLogService {
    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperLog sysOperLog) {
        remoteLogService.saveLog(sysOperLog, SecurityConstants.FROM_IN);
    }
}
