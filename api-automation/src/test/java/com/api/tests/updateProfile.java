package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.baseservice.AuthService;
import com.api.baseservice.UserManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.profileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class updateProfile {
	
	@Test
	public void updateProfileTest() {
		
	AuthService authservice=new AuthService();
	Response response= authservice.login(new LoginRequest("aish1234","aish1234"));
	LoginResponse loginresponse= response.as(LoginResponse.class);
	System.out.println(loginresponse.getToken());
	
	
	UserManagementService usemanagementservice=new UserManagementService();
	response=usemanagementservice.getProfile(loginresponse.getToken());
	System.out.println(response.asPrettyString());
	UserProfileResponse userprofileresponse=response.as(UserProfileResponse.class);
	System.out.println(userprofileresponse.getUsername());
    Assert.assertEquals(userprofileresponse.getUsername(), "aish1234");
    
    
    profileRequest profilerequest =new profileRequest.Builder()
    		.firstName("Aishwarya")
    		.lastName("Pawar")
    		.email("aish.pawar103@gmail.com")
    		.mobileNumber("8877889979")
    		.build();
	
    response=usemanagementservice.updateProfile(loginresponse.getToken(), profilerequest);
    System.out.println(response.asPrettyString());
	}

}
