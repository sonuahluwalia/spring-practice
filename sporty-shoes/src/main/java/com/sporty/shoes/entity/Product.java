package com.sporty.shoes.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	private String description;
	
	private Date dateCreated = new Date();
	
	private String manufacturerName;
	
	private String model;
	
	private Double cost;
	
	
	
	
}
