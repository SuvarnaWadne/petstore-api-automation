package FirstAPITesting;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetByID {
	@Test
	public void createAndGetPet() {

	    // CREATE PET
	    String requestBody = "{"
	            + "\"id\":110,"
	            + "\"name\":\"Tiger\","
	            + "\"status\":\"available\""
	            + "}";

	    given()
	        .contentType("application/json")
	        .body(requestBody)
	    .when()
	        .post("https://petstore.swagger.io/v2/pet")
	    .then()
	        .statusCode(200);

	    // GET PET
	    given()
	        .contentType("application/json")
	    .when()
	        .get("https://petstore.swagger.io/v2/pet/110")
	    .then()
	        .statusCode(200)
	        .log().all();
	}

}
