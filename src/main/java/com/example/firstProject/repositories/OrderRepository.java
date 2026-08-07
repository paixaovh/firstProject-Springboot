package com.example.firstProject.repositories;

import com.example.firstProject.entities.Order;
import com.example.firstProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
