package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

import com.simplilearn.lms.Gender;
import com.simplilearn.lms.User;

import javax.annotation.PostConstruct;

@Component
public class UserRepository {

	private static final Map<String, User> users = new HashMap<String, User>();
	
	@PostConstruct
	public void init() {
		User sumit = new User();
		sumit.setName("Sumit");
		sumit.setAge(34);
		sumit.setGender(Gender.MALE);
		users.put(sumit.getName(), sumit);
		
		User dilip = new User();
		dilip.setName("dilip");
		dilip.setAge(34);
		dilip.setGender(Gender.MALE);
		users.put(dilip.getName(), dilip);
	}
	
	public User findUser(String name) {
		if (name.isBlank()) {
			return new User();
		}
		return users.get(name);
	}
}
