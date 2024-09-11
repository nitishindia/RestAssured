package Payload;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class HashMap_ {
     
	   @Test
	   public void sampleTest() {
		   HashMap<Object, Object> map=new HashMap<Object, Object>();
		   map.put("name", "kumar");
		   map.put("Job", "QA");
		   
		     given().contentType(ContentType.JSON).body(map).
		     
		     
		         when().post("https://reqres.in/api/users").
		         
		         
		             then().log().all();
	   }
}
