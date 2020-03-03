package com.study.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.project.entities.Category;
import com.study.project.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category findById(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		
		return obj.get();
	}
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public void create(Category category) {
		categoryRepository.save(category);
	}
}
