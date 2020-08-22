package com.careerit.di.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public LoginService loginService() {
		LoginService service = new LoginService(userService());
		return service;
	}

	@Bean
	public UserService userService() {
		return new UserServiceInmemoryImpl();
	}
}
