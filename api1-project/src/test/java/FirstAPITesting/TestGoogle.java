package FirstAPITesting;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

public class TestGoogle {
	@Test
	public void testGoogle() {
	    RestAssured.useRelaxedHTTPSValidation();

	    given()
	    .when()
	        .get("https://www.google.com")
	    .then()
	        .statusCode(200)
	        .log().all();
	}
}
