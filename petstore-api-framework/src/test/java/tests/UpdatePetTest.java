package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import api.PetAPI;
import static org.hamcrest.Matchers.*;

public class UpdatePetTest extends BaseTest{
	  PetAPI api = new PetAPI();

	    @Test
	    public void updatePet() {
	        String updatedBody = "{ \"id\": 101, \"name\": \"tiger-updated\", \"status\": \"sold\" }";

	        api.updatePet(updatedBody)
	           .then()
	           .statusCode(200)
	           .body("name", equalTo("tiger-updated"))
	           .body("status", equalTo("sold"))
	           .log().all();
	    }
	

}
