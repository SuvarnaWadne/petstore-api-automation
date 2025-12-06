package FirstAPITesting;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class UpdatePet {
	@Test
	public void updatePet() {

	    String updateBody = "{"
	            + "\"id\":101,"
	            + "\"name\":\"Tommy Updated\","
	            + "\"status\":\"sold\""
	            + "}";

	    given()
	        .contentType("application/json")
	        .body(updateBody)
	    .when()
	        .put("https://petstore.swagger.io/v2/pet")
	    .then()
	        .statusCode(200)
	        .log().all();
	}


}
