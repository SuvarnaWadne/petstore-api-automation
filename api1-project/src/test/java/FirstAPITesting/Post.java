package FirstAPITesting;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Post {

	@Test
	public void loginUser() {

	    String loginBody = "{"
	            + "\"email\":\"eve.holt@reqres.in\","
	            + "\"password\":\"cityslicka\""
	            + "}";

	    given()
	        .contentType("application/json")
	        .body(loginBody)
	    .when()
	        .post("https://reqres.in/api/login")
	    .then()
	        .statusCode(200)
	        .log().all();
	}

}
