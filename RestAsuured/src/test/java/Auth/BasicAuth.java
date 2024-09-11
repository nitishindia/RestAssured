package Auth;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuth {

	 @Test
	 public void test() {
		 given().baseUri("http://postman-echo.com/").basePath("basic-auth").auth().basic("postman", "password").
         
         when().get().
         
               then().log().all();
	 }
}
