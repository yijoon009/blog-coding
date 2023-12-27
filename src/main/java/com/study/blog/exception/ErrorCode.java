package com.study.blog.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 커스텀한 에러코드를 작성한다.
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {

    // DB 관련 에러
    REQUIRED_FIELD_NULL(404, "REQUIRED_FIELD_NULL", "필수 컬럼값이 존재하지 않습니다."),
    FILE_NOT_FOUND(404, "FILE_NOT_FOUND", "파일 경로에 파일이 존재하지 않습니다."),
    FILE_DUPLICATED(404, "FILE_DUPLICATED", "중복된 파일입니다."),
    DB_ERROR(500, "DB_ERROR", "DB ERROR"),


    // 공통 에러
    IO_ERROR(404, "IO_ERROR", "INPUT/OUTPUT ERROR"),
    BAD_REQUEST(400, "BAD_REQUEST", "잘못된 요청"),
    FILTER_USERNAME_PASSWORD_AUTHENTICATION_TOKEN(404, "FILTER_USERNAME_PASSWORD_AUTHENTICATION_TOKEN", "filter attemptAuthentication 인증 에러"),
    EVENT_NOT_FOUND(404, "EVENT_NOT_FOUND", "이벤트 저장소에 해당 이벤트를 찾을 수 없습니다."),
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR", "서버 내부 오류"),
    NULL_POINTER_EXCEPTION(500, "NULL_POINTER_EXCEPTION", "Null 참조 오류"),
    ILLEGAL_ARGUMENT_EXCEPTION(400, "ILLEGAL_ARGUMENT_EXCEPTION", "부적절한 인자 오류");


    private final int status;
    private final String code;
    private final String message;

}

