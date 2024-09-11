package Validation;

import static io.restassured.RestAssured.given;
import static org.mockito.ArgumentMatchers.matches;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Vali_2 {
    @Test
	public void sampleTest() {
		
		Response res = given().contentType(ContentType.JSON).
		  
	    when().get("http://49.249.28.218:8091/projects-paginated");
	    
	       res. then().log().all()
	       
	       .header("Connection", Matchers.equalTo("keep-alive"))
	       .header("Connection", Matchers.containsString("keep"))
	       .header("Connection", Matchers.is("keep-alive"))
	      .body("content.projectName", Matchers.hasItem("xyz_3003"))
	      .header("Connection", Matchers.startsWith("k"))
	      .header("Connection", Matchers.anything("k"))
	      ;// this method is use for Array
	       
	       
	       
	         //log().all();
	       
	       
	}
}
