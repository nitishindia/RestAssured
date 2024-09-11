package Payload;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class JsonFile {
     
	   @Test
	   public void sampleTest() {
		   File f=new File("./json.json");
		   
		     given().contentType(ContentType.JSON).body(f).
		     
		     
		         when().post("https://reqres.in/api/users").
		         
		         
		             then().log().all();
	   }
}
