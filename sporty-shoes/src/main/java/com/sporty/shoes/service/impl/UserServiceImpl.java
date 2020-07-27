package com.sporty.shoes.service.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.sporty.shoes.entity.User;
import com.sporty.shoes.repositry.UserRepository;
import com.sporty.shoes.security.MyUserDetails;
import com.sporty.shoes.security.SecuredPasswordGenerator;
import com.sporty.shoes.service.iface.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepositry;
	

	@Override
	public String changePassword(String password) {
		System.out.println("reached changed password service");
		System.out.println("Password is: "+password);
		MyUserDetails securedUser = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("Username is: " + securedUser.getUsername());
		User user = userRepositry.getUserByUsername(securedUser.getUsername());
		user.setPassword(SecuredPasswordGenerator.securedPassword(password));
		user.setModifiedAt(new Date());
		if (userRepositry.save(user) != null ) {
			System.out.println(user.getUsername() + " password changed successfully");
			return user.getUsername() + " password changed successfully";	
		} else {
			System.out.println(user.getUsername() + " password not changed successfully");
			return user.getUsername() + " password not changed successfully";
		}
		
	}

}
