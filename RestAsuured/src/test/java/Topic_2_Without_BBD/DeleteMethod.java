package Topic_2_Without_BBD;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteMethod {

	@Test
	public void smapleTest() {

		given().contentType(ContentType.JSON).
		  
	    when().delete("https://petstore.swagger.io/v2/pet/9223372036854030141").
	    
	        then().log().all();
	}
}
