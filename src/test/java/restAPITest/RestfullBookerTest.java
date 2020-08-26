package restAPITest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestfullBookerTest {

    @Test
    public void validateStatus(){
        given().get("https://restful-booker.herokuapp.com/booking").then().statusCode(200).log().all();
    }
}
