package com.study.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.project.entities.Product;
import com.study.project.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable long id){
		Product obj = productService.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = productService.findAll();
		
		return ResponseEntity.ok().body(list);	
	}
	
	@PostMapping
	public ResponseEntity<Product> create(@RequestBody Product product){
		productService.create(product);
		
		return ResponseEntity.ok().body(product);
	}
	
	
}
