package com.order.orderService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.orderService.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
