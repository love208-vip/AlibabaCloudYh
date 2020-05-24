package com.yh.common.core.exception.user;

import com.yh.common.core.exception.BaseException;

/**
 * 用户信息异常类
 *
 * @author 洋芋-Sir
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
