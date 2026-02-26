package com.api.models.request;

public class SignUpRequest {
	
	private String Username;
	private String Password;
	private String Email;
	private String FirstName;
	private String LastName;
	private String MobileNumber;
	
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "SignUpRequest [Username=" + Username + ", Password=" + Password + ", Email=" + Email + ", FirstName="
				+ FirstName + ", LastName=" + LastName + ", MobileNumber=" + MobileNumber + "]";
	}
	
	
	public SignUpRequest(String username, String password, String email, String firstName, String lastName,
			String mobileNumber) {
		super();
		this.Username = username;
		this.Password = password;
		this.Email = email;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.MobileNumber = mobileNumber;
		
	}
	
	private SignUpRequest(Builder builder) {
		super();
		Username = builder.Username;
		Password = builder.Password;
		Email = builder.Email;
		FirstName =builder. FirstName;
		LastName = builder.LastName;
		MobileNumber = builder.MobileNumber;
	}

	public static class Builder {
		private String Username;
		private String Password;
		private String Email;
		private String FirstName;
		private String LastName;
		private String MobileNumber;
		
		public Builder userName(String Username) {
			this.Username=Username;
			return this;			
		}
		public Builder Password(String Password) {
			this.Password=Password;
			return this;			
		}
		public Builder Email(String Email) {
			this.Email=Email;
			return this;			
		}
		public Builder FirstName(String FirstName) {
			this.FirstName=FirstName;
			return this;			
		}
		public Builder LastName(String LastName) {
			this.LastName=LastName;
			return this;			
		}
		public Builder MobileNumber(String MobileNumber) {
			this.MobileNumber=MobileNumber;
			return this;			
		}
		
		 public SignUpRequest build() {
	            return new SignUpRequest(this);
	        }
	
	}
	

}
