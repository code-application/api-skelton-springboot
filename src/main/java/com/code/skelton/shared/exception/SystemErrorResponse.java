package com.code.skelton.shared.exception;

import org.springframework.http.HttpStatus;

/*
 * サーバーエラーのレスポンス
 */
public class SystemErrorResponse extends ErrorResponse {

    /*
     * サーバーエラーレスポンスを生成するコンストラクタ
     */
    public SystemErrorResponse() {
        super(HttpStatus.INTERNAL_SERVER_ERROR.value(), ErrorCode.ES_INTERNAL_SERVER_ERROR,
                ErrorMessage.SYSTEM_ERROR_MESSAGE);
    }
}
