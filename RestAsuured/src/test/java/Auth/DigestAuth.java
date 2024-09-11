package Auth;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DigestAuth {

	 @Test
	 public void test() {
		 given()
		    .baseUri("http://postman-echo.com/")
		    .basePath("basic-auth")
		    .auth()
		       .digest("postman", "password").
         
         when().get().
         
               then().log().all();
	 }
}
