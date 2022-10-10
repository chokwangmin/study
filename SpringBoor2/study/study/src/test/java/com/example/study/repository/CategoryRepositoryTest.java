package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class CategoryRepositoryTest extends StudyApplicationTests {
    @Autowired
    private CategoryRepository categoryRepository;
    @Test
    public void create(){
        Category category = new Category();
        category.setType("COMPUTER");
        category.setTitle("컴퓨터");
        category.setCreatedAt(LocalDateTime.now());
        category.setCreatedBy("Admin");

        categoryRepository.save(category);





    }
}
