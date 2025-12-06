package FirstAPITesting;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PatchUpdate {
	
	@Test
	public void patchPet() {

	    String patchBody = "{"
	            + "\"name\":\"Tommy Patched\""
	            + "}";

	    given()
	        .contentType("application/json")
	        .body(patchBody)
	    .when()
	        .patch("https://yourapi.com/pet/101")
	    .then()
	        .statusCode(200)
	        .log().all();
	}

}
