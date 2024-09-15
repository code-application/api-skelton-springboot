package com.code.skelton.integration.common.requests;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ErrorApi extends BaseApi {

    public static Response getUndefinedPath(String path) {
        Response response = given().contentType(ContentType.JSON).when().get(baseUrl + "/" + path);
        System.out.println("response: " + response.toString());
        return response;
    }

    public static Response postWrongMethodWithDefinedPath() {
        Response response = given().contentType(ContentType.JSON).when().patch(baseUrl + "/api/tasks");
        System.out.println("response: " + response.toString());
        return response;
    }

}
