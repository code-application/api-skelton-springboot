package com.code.skelton.shared.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * エラーレスポンスの構造を定義する
 */
public class ErrorResponse {
    @JsonProperty("status")
    private int status;

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    public ErrorResponse(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
