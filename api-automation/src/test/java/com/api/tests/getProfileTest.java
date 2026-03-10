package com.api.tests;

import org.testng.annotations.Test;

import com.api.baseservice.AuthService;
import com.api.baseservice.UserManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class getProfileTest {
	
	@Test
	public void getProfileTest() {
		
	AuthService authservice=new AuthService();
	Response response= authservice.login(new LoginRequest("aish1234","aish1234"));
	LoginResponse loginresponse= response.as(LoginResponse.class);
	System.out.println(loginresponse.getToken());
	UserManagementService usemanagementservice=new UserManagementService();
	response=usemanagementservice.getProfile(loginresponse.getToken());
	System.out.println(response.asPrettyString());
	UserProfileResponse userprofileresponse=response.as(UserProfileResponse.class);
	System.out.println(userprofileresponse.getUsername());

	
	}

}
