package com.educandoweb.cource.repositories;

import com.educandoweb.cource.entities.Category;
import com.educandoweb.cource.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
