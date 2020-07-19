package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.simplilearn.lms.GetUserRequest;
import com.simplilearn.lms.GetUserResponse;

@Endpoint
public class UserEndpoint {
	
	private static final String URI = "http://www.simplilearn.com/lms";
	
	private UserRepository userRepository;
	
	@Autowired
	public UserEndpoint(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@PayloadRoot(namespace = URI, localPart = "getUserRequest")
	@ResponsePayload
	public GetUserResponse getUser(@RequestPayload GetUserRequest userRequest) {
		GetUserResponse userResponse = new GetUserResponse();
		userResponse.setUser(userRepository.findUser(userRequest.getName()));
		return userResponse;
	}

}

