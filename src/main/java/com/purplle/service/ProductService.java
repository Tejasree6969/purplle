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
		    productDto.setPrice(product.getPrice());
		    productDto.setDiscount(product.getDiscount());
		    productDto.setIngredients(product.getIngredients());
		    productDto.setSku(product.getSku());
		    productDto.setStock_quantity(product.getStock_quantity());
		    productDto.setColor(product.getColor());
		    productDto.setCountry_of_origin(product.getCountry_of_origin());
		    productDto.setDimensions(product.getDimensions());
		    productDto.setExpiration_date(product.getExpiration_date());
		    productDto.setManufacturer(product.getManufacturer());
		    productDto.setWeight(product.getWeight());
		    productDto.setRating(product.getRating());
		    productDto.setReviews_count(product.getReviews_count());
		    productDto.setUpdated_at(product.getUpdated_at());
		    productDto.setCreated_at(product.getCreated_at());
		    productDto.setImages(product.getImages());
		    productDto.setStatus(product.getStatus());
		    
		    productDtos.add(productDto);
		}
		
					
		return productDtos;
	}
}
