package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Product;

public interface ProductRepositiory extends JpaRepository<Product, Integer>{

}
