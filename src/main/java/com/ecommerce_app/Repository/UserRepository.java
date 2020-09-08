package com.ecommerce_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_app.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
