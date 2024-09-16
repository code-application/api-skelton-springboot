package com.code.skelton.integration.common.requests;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HealthzApi extends BaseApi {

    public static Response getHealthCheckStatus() {
        Response response = given().contentType(ContentType.JSON).when().get(baseUrl + "/healthz");
        return response;
    }
}
