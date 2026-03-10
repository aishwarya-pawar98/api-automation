package com.api.tests;

import org.testng.annotations.Test;

import com.api.baseservice.AuthService;

import io.restassured.response.Response;

public class ForgotPassword {
	
	
		@Test(description="Verify if Forgot Password API is working")
	 
		public void LoginTest() {
			AuthService authService=new AuthService();
			
			Response response=authService.ForgotPass("aishwarya.pawar103@gmail.com");
			System.out.println(response.asPrettyString());
			
			
		}

	}

