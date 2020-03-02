package com.study.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.project.entities.Order;
import com.study.project.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	
	public Order findById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		
		return obj.get();
	}
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public void create(Order order) {
		orderRepository.save(order);
	}
	
}






