package Script;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import Generic.BaseClass;
import POJO.ProjectPayload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Script1 extends BaseClass{
    
	@Test
	public void test() {
		
		
		ProjectPayload p=new ProjectPayload("Nitish Kumar", "QA");
		RestAssured.given().spec(reqR).body(p).
	
		                when().post().
		                
		                       then().spec(reqP).
		                       
		                        log().all();
		
	}
}
