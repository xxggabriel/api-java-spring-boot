package com.educandoweb.cource.services;

import com.educandoweb.cource.entities.Category;
import com.educandoweb.cource.entities.User;
import com.educandoweb.cource.repositories.CategoryRepository;
import com.educandoweb.cource.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obg =  repository.findById(id);
        return obg.get();
    }

}
