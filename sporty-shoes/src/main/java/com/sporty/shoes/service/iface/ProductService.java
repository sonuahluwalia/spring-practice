package com.sporty.shoes.service.iface;

import java.util.List;
import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sporty.shoes.entity.Product;

public interface ProductService {

	public String addProduct(@Valid Product product);

	String updateProduct(@Valid Product product);

	String deleteProduct(@Valid Product product);

	public Page<Product> getProducts(Pageable pageable); 
}