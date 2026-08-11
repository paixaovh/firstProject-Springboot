package com.example.firstProject.repositories;

import com.example.firstProject.entities.Category;
import com.example.firstProject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
