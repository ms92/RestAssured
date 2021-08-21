package testCases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class POST_Create_A_Product {

	@Test
	public void get_Read_All_Products() {
		https://techfios.com/api-prod/api/product/create.php
		// given:all input details()
		// when:submit api requests
		// then:validate response

		Response response = 
			given()
			.baseUri("https://techfios.com/api-prod/api/product")
				.headers("Content-Type", "application/json").
			when()
				.get("/read.php").
			then()
				.extract().response();

		response.getBody().prettyPrint();

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}
}
