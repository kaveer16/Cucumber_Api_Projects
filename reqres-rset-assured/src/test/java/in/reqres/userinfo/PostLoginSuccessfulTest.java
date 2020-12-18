package in.reqres.userinfo;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostLoginSuccessfulTest extends TestBase {
    @Test
    public void verifyLoginSuccessfully(){
        UserPojo userPojo = new UserPojo();
        //userPojo.setFirst_name("Anil");
       // userPojo.setLast_name("kumar");
        userPojo.setEmail("raj@hotmail.com");
        userPojo.setPassword("megha");
        Response response = given().log().all()
                .when()
                .body(userPojo)
                .post("/register");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
