package org.Api.get;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PostSer {

    @Test
    public void post(){

        MainUser
                mainUser
                = new MainUser(10,
                101,
                "Yuvaraj",
                "Java"

        );

        Gson gson = new Gson();
      String body=  gson.toJson(mainUser);


        RestAssured.given()
                .log().all()
                .body(body)
                .when()
                .post("https://jsonplaceholder.typicode.com/Posts")
                .then()
                .statusCode(201).log().body();

    }
}
