import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class sample {
	public static void main(String[] args) {
		
		//base uri
		RestAssured.baseURI = "https://reqres.in";
		
		//given,when
	 RestAssured.given().header("content-type", "application/json").body(Payload.createUser())
			 .when().put("/api/users").then().assertThat().statusCode(201);
	 
				
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
				 
		
		
		//status code or resp code
//	int code = res.getStatusCode();
//		System.out.println(code);
		
		//body
//	ResponseBody responseBody = res.getBody();
//	String s=responseBody.asString();
	//	System.out.println(s);
				}

}