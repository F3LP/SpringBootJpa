package com.study.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.project.entities.Product;
import com.study.project.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product findById(Long id) {
		Optional<Product> obj = productRepository.findById(id);

		return obj.get();
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public void create(Product product) {
		productRepository.save(product);
	}

}
