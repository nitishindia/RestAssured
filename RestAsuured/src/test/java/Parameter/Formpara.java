package Parameter;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Formpara {
    
	@Test
	public void sapleTest() {
		
		Response res = given().contentType(ContentType.JSON).
				formParam("timeSize", 10).
				log().all().
				  
			    when().post("http://49.249.28.218:8091/project");
			    
			       res. then().log().all();
	}
}
