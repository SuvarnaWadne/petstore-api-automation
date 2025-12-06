package FirstAPITesting;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.File;

public class UploadImage {

	@Test
	public void uploadPetImage() {

	    File file = new File("src/test/resources/tiger.png");

	    given()
	        .multiPart("file", file)
	        .pathParam("petId", 101)
	    .when()
	        .post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")
	    .then()
	        .statusCode(200)
	        .body("message", containsString("tiger.png"))
	        .body("message", containsString("File"))
	        .log().all();
	}

}
