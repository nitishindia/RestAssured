package Payload;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class JsonObject_ {
    
	@Test
	public void smapleTest() {
		JSONObject json=new JSONObject();
		json.put("name", "nitish");
		json.put("job", "qA");
		
		given().contentType(ContentType.JSON).body(json).
	     
	     
        when().post("https://reqres.in/api/users").
        
        
            then().log().all();
		
	}
}
