package com.purplle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purplle.dto.ProductDto;
import com.purplle.service.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<ProductDto> getAllProducts() {
		
		List<ProductDto> productDtos= productService.getAllProducts();
		return productDtos;
		
	}

	
}
