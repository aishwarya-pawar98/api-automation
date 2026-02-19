package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.baseservice.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginTest {
	
	@Test(description="Verify if login API is working")
 
	public void LoginTest() {
		LoginRequest loginReq=new LoginRequest("aish1234","aish1234");
		AuthService authService=new AuthService();
		Response response=authService.login(loginReq);
		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		System.out.println(loginResponse.getToken());
		System.out.print(response.asPrettyString());
		
		Assert.assertTrue(loginResponse.getToken()!=null);
		Assert.assertEquals(loginResponse.getUsername(), "aish1234");
		
		
	}

}
