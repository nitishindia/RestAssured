package Parameter;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PathParameter {
    
	@Test
	public void sapleTest() {
		Response res = given().contentType(ContentType.JSON).pathParam("path", "NH_PROJ_489").
				log().all().
				  
			    when().get("http://49.249.28.218:8091/project/{path}");
			    
			       res. then().log().all();
	}
}
