package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
