package FirstAPITesting;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreatePet {
	 @Test
	    public void addNewPet() {

	        RestAssured.baseURI = "https://petstore.swagger.io/v2";

	        String requestBody = "{\n" +
	                "  \"id\": 101,\n" +
	                "  \"name\": \"Tommy\",\n" +
	                "  \"status\": \"available\"\n" +
	                "}";

	        given()
	                .header("Content-Type", "application/json")
	                .body(requestBody)
	        .when()
	                .post("/pet")
	        .then()
	                .statusCode(200)
	                .body("name", equalTo("Tommy"))
	                .log().all();
	    }

	
}
