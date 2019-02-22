package apiTesting;

import org.testng.annotations.Test;
import org.json.simple.*;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPOST {

	@Test
	 public void POST_Service()
	 {   
	// Specify the base URL to the RESTful web service
	 RestAssured.baseURI = "http://dummy.restapiexample.com";
		 	 
	 // Get the RequestSpecification of the request that you want to sent
	 RequestSpecification httpRequest = RestAssured.given();
	 
	 JSONObject requestParams = new JSONObject();
	 //requestParams.put("id", "00123526"); 
	 requestParams.put("name", "Prerna");
	 requestParams.put("salary", "83347854"); 
	 requestParams.put("age", "29"); 
	
	 
	 httpRequest.body(requestParams.toJSONString());
	 
	 Response response = httpRequest.request(Method.POST, "/api/v1/create");
	 
	 String responseBody = response.getBody().asString();
	 int responseStatus = response.statusCode();
	 
	 System.out.println("Response Body is => " + responseBody);
	 System.out.println("Response Status is => " + responseStatus);
}
}
