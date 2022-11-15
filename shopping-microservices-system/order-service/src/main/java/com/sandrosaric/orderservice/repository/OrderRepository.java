package com.sandrosaric.orderservice.repository;

import com.sandrosaric.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
