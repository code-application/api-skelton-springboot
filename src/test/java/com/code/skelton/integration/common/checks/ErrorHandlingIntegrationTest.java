package com.code.skelton.integration.common.checks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.code.skelton.integration.common.requests.ErrorApi;
import com.code.skelton.shared.exception.ErrorResponse;

import io.restassured.response.Response;

@SpringBootTest
@DisplayName("全体のエラーハンドリングのケース")
public class ErrorHandlingIntegrationTest {

    @ParameterizedTest
    @CsvSource({ "taskss", "ap/tasks", "tasks/99" })
    @DisplayName("未定義のエンドポイントにアクセスするとNOT FOUND例外が発生する")
    public void getUndefinedPathShouldReturn404(String path) {
        // Arrange
        // do nothing

        // Act
        Response response = ErrorApi.getUndefinedPath(path);

        // Assert
        assertEquals(404, response.getStatusCode());

        ErrorResponse error = response.as(ErrorResponse.class);
        assertEquals(404, error.getStatus());
        assertEquals("4001", error.getCode());
        assertThat(error.getMessage(), startsWith("Request Not Found"));
    }

    @Test
    @DisplayName("未定義のHTTPメソッドで既存のエンドポイントにアクセスするとNOT FOUND例外が発生する")
    public void postWrongMethodWithDefinedPathShouldReturn404() {
        // Arrange
        // do nothing

        // Act
        Response response = ErrorApi.postWrongMethodWithDefinedPath();

        // Assert
        assertEquals(404, response.getStatusCode());

        ErrorResponse error = response.as(ErrorResponse.class);
        assertEquals(404, error.getStatus());
        assertEquals("4001", error.getCode());
        assertThat(error.getMessage(), startsWith("Request Not Found"));
    }
}
