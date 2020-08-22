package com.careerit.di.scope;

import java.util.ArrayList;
import java.util.List;


public class UserServiceInmemoryImpl implements UserService {

	private List<User> users;

	public UserServiceInmemoryImpl() {
		this.users = new ArrayList<User>();
		this.users.add(User.builder().username("krish").password("krish@123").build());
		this.users.add(User.builder().username("manoj").password("manoj@123").build());
		this.users.add(User.builder().username("rajesh").password("rajesh@123").build());
		this.users.add(User.builder().username("suresh").password("suresh@123").build());
	}

	@Override
	public User loadUser(String username) {

		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

}
