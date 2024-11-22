package org.Api.get;

import com.google.gson.Gson;
import io.restassured.RestAssured;

public class GetSlideShow {

    public static void main(String[] args) {

    String responseBody=    RestAssured
                .given().when()
                .get("https://httpbin.org//json")
                .then()
                .extract().asString();
          System.out.println(responseBody);

          Gson gson = new Gson();
          SlideMain main =  gson.fromJson(responseBody,SlideMain.class);

          System.out.println(main.getSlideShow().getSlide().get(1).getItems().get(0));

    }
}
