package com.example.demo.repositories;

import com.example.demo.domain.Category;
import com.example.demo.domain.CategoryStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findByName(String name);
    List<Category> findByStatusNot(CategoryStatus status);
}
