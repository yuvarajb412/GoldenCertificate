package org.Api.get;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.Api.Users;
import org.Java.Basic.Main;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class GetDeserilazation {

    @Test
    public void test(){

    String response= RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then().statusCode(200)
                .extract().asString();


        Gson gson = new Gson();
      List<MainUser> out= gson.fromJson(response,new TypeToken<List<MainUser>>(){}.getType());



        System.out.println(out.size());

        MainUser c =  out.getFirst();

        assertEquals(out.size(),100);
        assertEquals(c.getUserId(),1);
        assertEquals(c.getId(),1);
        assertEquals(c.getTitle(), "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");

    }
}
