package com.yh.common.core.exception;

/**
 * 验证码异常
 *
 * @author 洋芋-Sir
 */
public class ValidateCodeException extends Exception {
    private static final long serialVersionUID = 3887472968823615091L;

    public ValidateCodeException() {
    }

    public ValidateCodeException(String msg) {
        super(msg);
    }
}