package com.code.skelton.shared.exception;

import org.springframework.http.HttpStatus;

/*
 * 404エラーレスポンス
 */
public class NotFoundErrorResponse extends ErrorResponse {

    public NotFoundErrorResponse() {
        super(HttpStatus.NOT_FOUND.value(), ErrorCode.EB_NOT_FOUND, ErrorMessage.NOT_FOUND_MESSAGE);
    }
}
