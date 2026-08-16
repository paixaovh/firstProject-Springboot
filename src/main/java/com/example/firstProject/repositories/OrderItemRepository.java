package com.example.firstProject.repositories;

import com.example.firstProject.entities.OrderItem;
import com.example.firstProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
