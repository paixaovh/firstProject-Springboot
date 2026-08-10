package com.example.firstProject.repositories;

import com.example.firstProject.entities.Category;
import com.example.firstProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
