package Payload;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POJOCLASS {

	
	@Test
	public void sampleTest() {
		data d=new data(1, "michael.lawson@reqres.in", "Michael", "https://reqres.in/img/faces/7-image.jpg");
		ArrayList a=new ArrayList();
		a.add(d);
		
		PojoPayloa p=new PojoPayloa(2, 6, 12, 2, a);
	     given().contentType(ContentType.JSON).body(p).
	     
	     
         when().post("https://reqres.in/api/users").
         
         
             then().log().all();
	}
}
