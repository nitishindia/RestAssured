package Validation;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetMethod {
    @Test
	public void sampleTest() {
		int expacted=1;
		Response res = given().contentType(ContentType.JSON).
		  
	    when().get("https://reqres.in/api/user");
	    
	       res. then().log().all();
	       
	       int page = res.jsonPath().getInt("page");
	       
	       Assert.assertEquals(page, expacted);
	       
	       
	       res.then().log().all();
	       res .then().body("data", Matchers.hasSize(6));
	       res.then().body("data.name", Matchers.hasItem("cerulean"));
	       
	}
}
