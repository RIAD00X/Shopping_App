package com.example.SHOPPING_APP.repository;

import com.example.SHOPPING_APP.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {
}
