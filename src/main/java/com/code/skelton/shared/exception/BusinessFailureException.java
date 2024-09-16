package com.code.skelton.shared.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * 業務エラー HTTPステータス「400」のレスポンスを返却する
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BusinessFailureException extends RuntimeException {

    /*
     * RuntimeExceptionのメッセージを上書きするコンストラクタ
     */
    public BusinessFailureException(String message) {
        super(message);
    }
}
