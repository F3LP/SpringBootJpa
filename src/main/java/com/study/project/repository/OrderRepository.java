package com.study.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.project.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
