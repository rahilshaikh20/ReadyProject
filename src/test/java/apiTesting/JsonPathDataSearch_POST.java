package apiTesting;

import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Given;

import org.json.simple.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonPathDataSearch_POST {

	@Test
	 public void POST_Service()
	 {   
	// Specify the base URL to the RESTful web service
	 RestAssured.baseURI = "http://dummy.restapiexample.com";
		 	 
	 // Get the RequestSpecification of the request that you want to sent
	 RequestSpecification httpRequest = RestAssured.given();
	 
	 JSONObject requestParams = new JSONObject();
 
	 requestParams.put("name", "Imran");
	 requestParams.put("salary", "900000"); 
	 requestParams.put("age", "34"); 
	
	 
	 httpRequest.body(requestParams.toJSONString());
	 
	 Response response = httpRequest.request(Method.POST, "/api/v1/create");
	 response.prettyPrint();

	
	 int responseStatus = response.statusCode();
	 JsonPath extractor = response.jsonPath();
	 
	 String name=extractor.get("data.name");
	 int ID= extractor.get("data.id");
	 
	
	 System.out.println("Response Code is => " + responseStatus);
	 System.out.println("Name retrived from Response: "+name);
	 System.out.println("ID retrived from Response: "+ ID);
	 
	 
}
}
