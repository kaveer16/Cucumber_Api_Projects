package in.reqres.userinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetListUsersInfoTest extends TestBase {
    @Test
    public void getAllUsersInfo(){
        Response response = given()
                .queryParam("page","2")
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
