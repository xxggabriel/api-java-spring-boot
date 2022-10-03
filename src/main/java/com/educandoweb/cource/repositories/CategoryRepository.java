package com.educandoweb.cource.repositories;

import com.educandoweb.cource.entities.Category;
import com.educandoweb.cource.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
