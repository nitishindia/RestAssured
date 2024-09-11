package Validation;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Basic {

	@Test
	public void sampleTest() {
		
		Response res = given().contentType(ContentType.JSON).
				  
			    when().get("http://49.249.28.218:8091/projects-paginated");
			    
			       res. then().log().all().
			       statusCode(200).
			       statusLine("HTTP/1.1 200 ").and()
			       .time(Matchers.lessThan(28336l)).and()
			       .time(Matchers.lessThanOrEqualTo(367573256L)).and()
			       .time(Matchers.greaterThan(6L)).and()
			       .time(Matchers.greaterThanOrEqualTo(5l));
	}
}
