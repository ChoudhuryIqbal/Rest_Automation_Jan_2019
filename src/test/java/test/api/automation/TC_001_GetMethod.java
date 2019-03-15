package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_001_GetMethod {
	
	@Test
	public void tc_001_getMethod_validation() {
		Response response = RestAssured.get("http://services.groupkt.com/state/search/IND?text=pradesh");
		System.out.println(response.asString());
		System.out.println("Status response code \t \t"+ response.getStatusCode());
		Assert.assertEquals(200,response.getStatusCode());
		
		
		
	}
	@Test
	public void tc_001_getMethod_contentType() {
		Response res=RestAssured.get("http://services.groupkt.com/state/get/IND/UP");
		Assert.assertEquals(res.getContentType(),"application/json;charset=UTF-8");
		
	}
}
