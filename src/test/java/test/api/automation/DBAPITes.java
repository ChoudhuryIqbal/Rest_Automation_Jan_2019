package test.api.automation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DBAPITes {
	
	@Test
	public void tc_001() {
		 try {
			given()
			.contentType(ContentType.JSON)
			.body("[\r\n" + 
					"    {\r\n" + 
					"        \"id\": 1,\r\n" + 
					"        \"title\": \"json-server\",\r\n" + 
					"        \"author\": \"typicode\"\r\n" + 
					"    }\r\n" + 
					"]")
			.when()
			.post("  http://localhost:3000/posts").then().statusCode(201);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured. /t "+ "/n Exception Message /t "+e.getMessage()+ "/n Exception Name /t"+ e.getLocalizedMessage());
		}
		
		//System.out.println("Response as a string /t"+res.asString());
	}

}
