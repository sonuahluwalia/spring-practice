package com.sporty.shoes.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sporty.shoes.entity.User;
import com.sporty.shoes.repositry.UserRepository;
import com.sporty.shoes.security.MyUserDetails;
import com.sporty.shoes.security.SecuredPasswordGenerator;
import com.sporty.shoes.service.UserService;


@Controller
public class UserController {

	@Autowired
	UserRepository userRepositry;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String loginSuccessHandler() {
		System.out.println("reached login success handler");
		return "index";
	}
	
//	@GetMapping("/login")
//	public String login() {
//		System.out.println("reached login  handler");
//		return "login";
//	}
	
//	@PostMapping("/changePassword")
//	public String changePassword(@RequestParam String password) {
//		System.out.println("reached changed password controller");
//		System.out.println(password);
//		userService.changePassword(password);
//		return "index";
//	}

}
