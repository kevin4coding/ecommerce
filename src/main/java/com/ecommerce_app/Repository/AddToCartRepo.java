package com.ecommerce_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_app.model.AddtoCart;

public interface AddToCartRepo extends JpaRepository<AddtoCart, Long>{

}
