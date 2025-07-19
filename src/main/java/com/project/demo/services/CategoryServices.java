package com.project.demo.services;

import com.project.demo.model.Category;
import com.project.demo.repositories.CategoryRepository;
import com.project.demo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
