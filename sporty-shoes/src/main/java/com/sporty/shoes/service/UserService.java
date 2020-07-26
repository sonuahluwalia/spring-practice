package com.sporty.shoes.service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.sporty.shoes.entity.User;
import com.sporty.shoes.repositry.UserRepository;
import com.sporty.shoes.security.MyUserDetails;
import com.sporty.shoes.security.SecuredPasswordGenerator;

@Service
public class UserService {

	@Autowired
	UserRepository userRepositry;
	

//	public void changePassword(String password) {
//		System.out.println("reached changed password service");
//		System.out.println(password);
//		MyUserDetails securedUser = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		System.out.println(securedUser.getUsername());
//		User user = userRepositry.getUserByUsername(securedUser.getUsername());
//		user.setPassword(SecuredPasswordGenerator.securedPassword(password));
//		user.setModifiedAt(new Date());
//		userRepositry.save(user);
//		System.out.println(user.getUsername() + " password changed successfully");
//	}

}
