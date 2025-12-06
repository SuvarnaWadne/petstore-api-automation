package api;

import static io.restassured.RestAssured.given;

import java.io.File;
import io.restassured.response.Response;

public class PetAPI {
	 public Response createPet(String body) {
	        return given()
	                .header("Content-Type", "application/json")
	                .body(body)
	               .when()
	                .post("/pet");
	    }

	    public Response getPetById(int id) {
	        return given()
	                .pathParam("petId", id)
	               .when()
	                .get("/pet/{petId}");
	    }

	    public Response updatePet(String body) {
	        return given()
	                .header("Content-Type", "application/json")
	                .body(body)
	               .when()
	                .put("/pet");
	    }

	    public Response deletePet(int id) {
	        return given()
	                .pathParam("petId", id)
	               .when()
	                .delete("/pet/{petId}");
	    }

	    public Response uploadImage(int id, File file) {
	        return given()
	                .multiPart("file", file)
	                .pathParam("petId", id)
	               .when()
	                .post("/pet/{petId}/uploadImage");
	    }
	

}
