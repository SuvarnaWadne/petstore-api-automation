package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import api.PetAPI;

public class DeletePetTest extends BaseTest {
	 PetAPI api = new PetAPI();

	    @Test
	    public void deletePet() {
	        api.deletePet(101)
	           .then()
	           .statusCode(200)
	           .log().all();
	    }

	
}
