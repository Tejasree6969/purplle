package com.purplle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purplle.dto.ProductDto;
import com.purplle.entity.Product;
import com.purplle.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<ProductDto> getAllProducts() {
		
		// fetch data from database 
		List<Product> products=productRepository.findAll();  // it is equal to Select * from product 
		
		List<ProductDto> productDtos= new ArrayList<>();  
		
		// loop all database data and set to dtos
		for (Product product : products) {
			
		    ProductDto productDto = new ProductDto();
		    productDto.setId(product.getId());
		    productDto.setProductName(product.getProductName());
		    productDto.setDescription(product.getDescription());
		    productDto.setCategory(product.getCategory());
		    productDto.setSku(product.getSku());
		    productDto.setStockQuantity(product.getStockQuantity());
		    productDto.setSize(product.getSize());
		    productDto.setColor(product.getColor());
		    productDto.setDimensions(product.getDimensions());
		    productDto.setIngredients(product.getIngredients());
		    productDto.setManufacturer(product.getManufacturer());
		    productDto.setCountryOfOrigin(product.getCountryOfOrigin());
		    productDto.setExpirationDate(product.getExpirationDate());
		    productDto.setCreatedAt(product.getCreatedAt());
		    productDto.setUpdatedAt(product.getUpdatedAt());
		    productDto.setImages(product.getImages());
		    productDto.setStatus(product.getStatus());
		    productDto.setRating(product.getRating());
		    productDto.setReviewCount(product.getReviewCount());
		    productDto.setPrice(product.getPrice());
		    productDto.setWeight(product.getWeight());
		    productDto.setDiscount(product.getDiscount());
		   
		    productDtos.add(productDto);
		}
		
			
		
		return productDtos;
	}
	
}
