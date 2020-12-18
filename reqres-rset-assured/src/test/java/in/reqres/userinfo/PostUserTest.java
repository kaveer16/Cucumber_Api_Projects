package in.reqres.userinfo;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class PostUserTest extends TestBase {

    @Test
    public void createUser(){
        UserPojo userPojo = new UserPojo();
        userPojo.setFirst_name("Raj");
        userPojo.setLast_name("Aryan");
        userPojo.setJob("leader");
        userPojo.setEmail("rajaryan@hotmail.com");
        userPojo.setAvatar("https://reqres.in/img/faces/-image.jpg");
        Response response = given().log().all()
                .when()
                .body(userPojo)
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();




    }

}
