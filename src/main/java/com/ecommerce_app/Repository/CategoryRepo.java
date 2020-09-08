package com.ecommerce_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_app.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
