package Validation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ComplaxVali {
	@Test
	public void sampleTest() {
		
		Response res = given().contentType(ContentType.JSON).
				  
			    when().get("http://49.249.28.218:8091/projects-paginated");
			    
			       res. then().log().all();
			       
			       ArrayList<Object> a1=JsonPath.read(res.asString(),"content[*].projectName" );
                   for(Object s:a1) {
                	   System.out.println(s);
                   }
                   
                   
                   ArrayList<String> a11=JsonPath.read(res.asString(),"content[*].[?(@.projectName=='xyz_1358')].projectId");
                   
			     String actual=a11.get(0).toString();
			     System.out.println("Actual check ====>  "+actual);
	}
}
