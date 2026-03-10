package com.api.baseservice;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import com.api.models.request.LoginRequest;



public class BaseService {
	
	public static final String BASE_URL="http://64.227.160.186:8080/";
	private RequestSpecification requestspecification;
	
	public BaseService() {
		requestspecification= given().baseUri(BASE_URL);
	}
	
	protected Response postRequest(Object payload, String Endpoint) {
		return requestspecification.contentType(ContentType.JSON).body(payload).post(Endpoint);
				
	}
	
	protected Response getRequest(String Endpoint) {
		return requestspecification.get(Endpoint);
				
	}
	
	protected void setAuthToken(String token) {
		requestspecification.header("Authorization","Bearer "+token);
	}
	
	protected Response putRequest(Object payload, String Endpoint) {
		return requestspecification.contentType(ContentType.JSON).body(payload).put(Endpoint);
				
	}

}
