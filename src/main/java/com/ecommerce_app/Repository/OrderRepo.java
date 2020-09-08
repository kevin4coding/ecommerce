package com.ecommerce_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_app.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {
	
}
