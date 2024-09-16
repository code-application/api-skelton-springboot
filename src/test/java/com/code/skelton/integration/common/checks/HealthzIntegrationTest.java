package com.code.skelton.integration.common.checks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.code.skelton.integration.common.requests.HealthzApi;
import io.restassured.response.Response;

public class HealthzIntegrationTest {

    @Test
    @DisplayName("APIヘルスチェック; APIサーバーが正常に稼働しているときOKを返す")
    public void getHomeShouldReturn200AndCorrectMessage() {
        // Arrange
        // do nothing

        // Act
        Response response = HealthzApi.getHealthCheckStatus();

        // Assert
        assertEquals(200, response.getStatusCode());
        assertEquals("OK", response.getBody().asString());
    }
}
