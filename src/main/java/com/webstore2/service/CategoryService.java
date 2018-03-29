package com.webstore2.service;

import com.webstore2.domain.Category;
import com.webstore2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getTopCategories() {
        return categoryRepository.getCategoriesByTop(true);
    }
}
