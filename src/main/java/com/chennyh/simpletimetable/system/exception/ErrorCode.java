package com.chennyh.simpletimetable.system.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    USER_NAME_ALREADY_EXIST(1001, HttpStatus.BAD_REQUEST, "用户名已经存在"),
    EMAIL_ALREADY_EXIST(1002, HttpStatus.NOT_FOUND, "邮箱已经存在"),
    NOT_FOUND(1003, HttpStatus.NOT_FOUND, "未找到指定资源"),
    USER_ID_NOT_FOUND(1004, HttpStatus.NOT_FOUND, "未找到用户ID"),
    COURSE_ID_NOT_FOUND(1005, HttpStatus.NOT_FOUND, "未找到课程ID"),
    VERIFY_JWT_FAILED(1006, HttpStatus.UNAUTHORIZED, "token验证失败"),
    METHOD_ARGUMENT_NOT_VALID(1007, HttpStatus.BAD_REQUEST, "方法参数验证失败");
    private final int code;

    private final HttpStatus status;

    private final String message;

    ErrorCode(int code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }
}
