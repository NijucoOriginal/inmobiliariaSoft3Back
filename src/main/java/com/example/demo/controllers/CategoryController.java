package com.example.demo.controllers;

import com.example.demo.dtos.CategoryRequest;
import com.example.demo.dtos.CategoryResponse;
import com.example.demo.services.CategoryServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryServices categoryServices;

    @PostMapping
    public CategoryResponse create(@Valid CategoryRequest category) {
        return categoryServices.save(category);
    }

    @GetMapping
    public List<CategoryResponse> getAll() {
        return categoryServices.findAll();
    }

    @PutMapping("/{id}")
    public CategoryResponse update(@PathVariable("id") String id, @Valid CategoryRequest category) {
        return categoryServices.update(id, category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        categoryServices.deleteById(id);
    }

    @GetMapping("/{id}")
    public CategoryResponse findById(@PathVariable("id") String id) {
        return categoryServices.findById(id);
    }
}
