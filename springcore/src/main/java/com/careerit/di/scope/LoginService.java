package com.careerit.di.scope;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginService {
	
	
	private UserService userService;
	
	public LoginService(UserService userService) {
		
	}

	public User login(String username, String password) {

		User user = userService.loadUser(username);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		throw new IllegalArgumentException("Bad credentials...");
	}

}
