package com.educandoweb.cource.repositories;

import com.educandoweb.cource.entities.Order;
import com.educandoweb.cource.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
