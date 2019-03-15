package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import JsonObjectClass.CreatePost;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Tc_Pojo_Example {

	@Test
	public void tc_002_PostMethod() {
		CreatePost cpost = new CreatePost();
		cpost.setId(9);
		cpost.setAuthor("json-server");
		cpost.setTitle("iqbal");

		given().body(cpost).when().post("http://localhost:3000/posts").then()

				.statusCode(201);

	}

	@Test
	public void tc_002_PostMethodUsingJsonPath() {
		CreatePost cpost = new CreatePost();
		cpost.setId(11);
		cpost.setAuthor("json-server");
		cpost.setTitle("iqbal");

		String responseAsString = when().get("http://localhost:3000/posts").then().extract()
				.asString();
		JsonPath js = new JsonPath(responseAsString);
		String actual=js.get("[1].[0]");
		Assert.assertEquals(actual,"2");

	}

}
