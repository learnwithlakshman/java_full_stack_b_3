package com.lwl.cbook.day31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {

	List<User> users;
	Map<String, User> userMap;

	UserService() {
		try {
			users = Files.readAllLines(Paths.get("resources/users.txt")).stream().skip(1).map(line -> mapToUser(line))
					.collect(Collectors.toList());
			userMap = users.stream().collect(Collectors.toMap(User::getEmail, u -> u));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public User login(String email, String password) throws UserNotFoundException {
		User user = userMap.get(email);

		if (user != null) {
			if (user.getPassword().equals(password)) {
				return user;
			} else {
				throw new UserNotFoundException("Bad credentials");
			}
		}

		throw new UserNotFoundException("User with email/password not exists");

	}

	private User mapToUser(String line) {
		String[] arr = line.split(",");
		String name = arr[0];
		String password = arr[1];
		String email = arr[2];
		String role = arr[3];
		return new User(name, email, password, role);
	}
}
