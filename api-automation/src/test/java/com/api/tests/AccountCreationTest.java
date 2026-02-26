package com.api.tests;

import org.testng.annotations.Test;

import com.api.baseservice.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description="Verify if Account Creation API Working")
	
	public void AccountCreationTest() {
		
		SignUpRequest SignupReq=new SignUpRequest.Builder().FirstName("Aishwarya").Email("aishwarya.pawar103@gmail.com")
		.LastName("Pawar").Password("aish1234").MobileNumber("99867456789").userName("Aish").build();
		
		AuthService authservice=new AuthService();
		Response response=authservice.SignUp(SignupReq);
		System.out.println(response.asPrettyString());
	}

}
