package com.educandoweb.cource.services;

import com.educandoweb.cource.entities.User;
import com.educandoweb.cource.repositories.UserRepository;
import com.educandoweb.cource.resources.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obg =  repository.findById(id);
        return obg.get();
    }

}
