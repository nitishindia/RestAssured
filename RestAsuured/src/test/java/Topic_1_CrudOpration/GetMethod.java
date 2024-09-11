package Topic_1_CrudOpration;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetMethod {
    @Test
	public void sampleTest() {
		
		given().contentType(ContentType.JSON).
		  
	    when().get("https://petstore.swagger.io/v2/pet/9223372036854030141").
	    
	        then().log().all();
	}
}
