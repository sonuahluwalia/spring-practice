package com.spring.validation.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
    
    public User(@NotBlank(message = "Name is mandatory") String name,
			@NotBlank(message = "Email is mandatory") String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;
    
    // standard constructors / setters / getters / toString
        
}