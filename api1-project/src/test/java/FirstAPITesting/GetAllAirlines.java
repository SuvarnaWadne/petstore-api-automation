package FirstAPITesting;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

public class GetAllAirlines {
	@Test
	public void getAllAirlines() {
	    RestAssured.baseURI = "https://api.instantwebtools.net/v1";

	    given()
	    .when()
	        .get("/airlines")
	    .then()
	        .statusCode(200)
	        .log().all();
	}

}
