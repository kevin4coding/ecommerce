package com.ecommerce_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_app.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
