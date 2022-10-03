package com.educandoweb.cource.services;

import com.educandoweb.cource.entities.Category;
import com.educandoweb.cource.entities.Product;
import com.educandoweb.cource.repositories.CategoryRepository;
import com.educandoweb.cource.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obg =  repository.findById(id);
        return obg.get();
    }

}
