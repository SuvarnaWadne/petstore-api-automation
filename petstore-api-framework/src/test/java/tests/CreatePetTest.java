package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import api.PetAPI;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CreatePetTest extends BaseTest {
	 PetAPI api = new PetAPI();

	    @Test
	    public void createPetTest() throws Exception {
	        String body = new String(Files.readAllBytes(Paths.get("src/test/resources/pet.json")));

	        Response res = api.createPet(body);

	        res.then()
	            .statusCode(200)
	            .body("id", equalTo(101))
	            .body("name", equalTo("tiger"))
	            .log().all();
	    }
}
