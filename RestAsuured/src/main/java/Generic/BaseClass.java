package Generic;

import java.io.IOException;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	FileUtility file=new FileUtility();
	public static RequestSpecification reqR;
	public static ResponseSpecification reqP;
	@BeforeSuite
	public void start() throws IOException {

		
		 String baseUri=file.getDataFromPropertiesFile("Baseuri");
		 RequestSpecBuilder reqs=new RequestSpecBuilder();
		 reqs.setContentType(ContentType.JSON);
		 reqs.setBaseUri(baseUri);
		 reqR=reqs.build(); // used to make chain for entire framework
		
	}
	
	
	@AfterSuite
	public void finish() {
		ResponseSpecBuilder resP=new ResponseSpecBuilder();
//		resP.expectResponseTime(Matchers.lessThan(6556L));
//		resP.expectHeader("Connection",Matchers.equalTo("keep-alive"));
//		resP.expectContentType(ContentType.JSON);
		reqP=resP.build();
		
		
	}
}
