package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import api.PetAPI;
import java.io.File;
import static org.hamcrest.Matchers.*;

public class UploadImageTest extends BaseTest {
	 PetAPI api = new PetAPI();

	    @Test
	    public void uploadImage() {
	        File file = new File("src/test/resources/tiger.png");

	        api.uploadImage(101, file)
	           .then()
	           .statusCode(200)
	           .body("message", containsString("tiger.png"))
	           .log().all();
	    }

}
