package com.catalog.user;

public class UserLoginServices {
	public boolean isUserValid(String name, String password) {
		
		if (name.contentEquals("tert") && password.contentEquals("tert")) 
			return true;
		
		return false;
	}
}