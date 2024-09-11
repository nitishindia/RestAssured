package Auth;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BerearToken {
 
	@Test
	public void test() {
     given().baseUri("http://postman-echo.com/").
       basePath("basic-auth").auth().basic("postman", "password").
         
         when().get().
         
               then().log().all();
	}
}
