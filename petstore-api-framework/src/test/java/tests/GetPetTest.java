package tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

import base.BaseTest;
import api.PetAPI;
public class GetPetTest extends BaseTest{
	  @Test
	    public void getPet() {
	        given()
	        .when()
	            .get("https://petstore.swagger.io/v2/pet/101")
	        .then()
	            .statusCode(200)
	            .body("id", equalTo(101));
	    }
}
