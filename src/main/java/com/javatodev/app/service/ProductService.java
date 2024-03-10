package com.javatodev.app.service;


import com.javatodev.app.model.Product;
import com.javatodev.app.repository.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> readProducts() {
        return productRepository.findAll();
    }

}
