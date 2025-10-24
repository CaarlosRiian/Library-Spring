package com.librarySpring.library.service;

import com.librarySpring.library.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Object[]> countBooksByCategory() {
        return categoryRepository.countBooksByCategory();
    }
}
