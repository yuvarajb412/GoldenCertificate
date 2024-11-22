package org.Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class GetRequest {

    @Test
    public void getRequest(){


    Response response= RestAssured.given()
                .when().get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .statusCode(200)
                .log().body().extract().response()
                ;


    response.then()
            .body("size()",greaterThan(0))
            .body("[0].id",equalTo(1));

    }
}
