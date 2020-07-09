package com.spring.validation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.validation.domain.User;
import com.spring.validation.repositry.UserRepository;

@SpringBootApplication
public class SpringBootValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootValidationApplication.class, args);
	}

	@Bean
    public CommandLineRunner run(UserRepository userRepository) throws Exception {
        return (String[] args) -> {
            User user1 = new User("Bob", "bob@domain.com");
            User user2 = new User("Jenny", "jenny@domain.com");
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
