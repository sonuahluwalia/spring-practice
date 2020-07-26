package com.sporty.shoes.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sporty.shoes.entity.User;
import com.sporty.shoes.repositry.UserRepository;
import com.sporty.shoes.security.SecuredPasswordGenerator;

@Configuration
public class UserUtil {
	
	@Autowired
	UserRepository userRepositry;
	
	@Bean
	public void onStartup() {
		User user = new User();
		user.setUsername("admin");
		user.setPassword(SecuredPasswordGenerator.securedPassword("admin"));
		user.setCreatedAt(new Date());
		user.setModifiedAt(new Date());
		user.setEnabled(true);
		user.setRole("ROLE_ADMIN");
		userRepositry.save(user);
		System.out.println("admin user saved");
	}
}
