package Auth;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Prem {

	 @Test
	 public void test() {
		 given().baseUri("http://postman-echo.com/").
		 basePath("basic-auth").auth().preemptive().
		 basic("postman", "password").
         
         when().get().
         
               then().log().all();
	 }
}
