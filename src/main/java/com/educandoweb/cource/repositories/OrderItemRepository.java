package com.educandoweb.cource.repositories;

import com.educandoweb.cource.entities.OrderItem;
import com.educandoweb.cource.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
