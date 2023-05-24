package com.xiudu.blog.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: 锈渎
 * @date: 2023/5/24 10:04
 * @code: 面向对象面向君， 不负代码不负卿。
 * @description: 自定义异常(not found)
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends  RuntimeException{

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}