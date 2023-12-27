package com.study.blog.exception;

import lombok.Getter;

/**
 * User 커스텀 예외처리 클래스
 */
@Getter
public class BlogApplicationException extends RuntimeException {

    private ErrorCode errorCode;

    public BlogApplicationException(ErrorCode errorCode) {
        super(errorCode.getMessage()); // 여기에서 예외 메시지를 설정합니다.
        this.errorCode = errorCode;
    }

}