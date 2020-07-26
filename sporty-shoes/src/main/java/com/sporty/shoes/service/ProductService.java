package com.sporty.shoes.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.entity.Product;
import com.sporty.shoes.repositry.ProductRepository;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/product")
public class ProductService {

	@Autowired
	ProductRepository productRepositry;
	
	@PostMapping("/add")
    public <T> ResponseEntity<T> addProduct(@Valid @RequestBody Product product) {
        
        productRepositry.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

//	@PostMapping("/update")
//    public <T> ResponseEntity<T> updateProduct(@Valid @RequestBody Product product) {
//        
//        productRepositry.save(product);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
	
	

}

