package com.example.SHOPPING_APP.controller;

import com.example.SHOPPING_APP.dto.ProductRequest;
import com.example.SHOPPING_APP.dto.ProductResponse;
import com.example.SHOPPING_APP.service.ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")

public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getALLProducts(){
        return productService.getAllProducts();
    }

}
