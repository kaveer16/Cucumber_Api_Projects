package in.reqres.userinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSingleUserInfoTest extends TestBase {

    @Test
    public void getASingleUserInfo(){
        Response response = given()
                .when()
                .get("/users/2");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
