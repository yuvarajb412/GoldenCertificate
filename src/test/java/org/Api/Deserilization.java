package org.Api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.restassured.common.mapper.TypeRef;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Deserilization {



    @Test
    public  void testDesrilization(){




   Response response = given().when().get("https://jsonplaceholder.typicode.com/users")
                .then().statusCode(200)
              .extract().response();

         String value=response.then().log().body().extract().asString();

        Gson gson = new Gson();
      List<Users> user=  gson.fromJson(value,new TypeToken<List<Users>>(){}.getType());
        System.out.println(user.get(0).getId());
        System.out.println(user.get(0).getWebsite());










    }

}
