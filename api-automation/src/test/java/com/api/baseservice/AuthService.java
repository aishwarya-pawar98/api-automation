package com.api.baseservice;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	
	private static final String BASE_URL="/api/auth/";
	
	public Response login(LoginRequest payload) {
		return postRequest(payload,BASE_URL+"login");
	}
	
	
	public Response SignUp(SignUpRequest payload) {
		return postRequest(payload,BASE_URL+"signup");
	}
	
	public Response ForgotPass(String emailAddress) {
		HashMap<String,String> payload= new HashMap<String,String>();
		payload.put("email", emailAddress);
		return postRequest(payload,BASE_URL+"forgot-password");
	}

}
