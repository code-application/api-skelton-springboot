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

    /*
     * コンストラクタ
     */
    public ErrorResponse(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    /*
     * HTTPステータスを取得する
     * 
     * @return HTTPステータス
     */
    public int getStatus() {
        return this.status;
    }

    /*
     * エラーコードを取得する
     * 
     * @return エラーコード
     */
    public String getCode() {
        return this.code;
    }

    /*
     * エラーメッセージを取得する
     * 
     * @return エラーメッセージ
     */
    public String getMessage() {
        return this.message;
    }
}
