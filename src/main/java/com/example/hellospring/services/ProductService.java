package com.example.hellospring.services;

import com.example.hellospring.models.Product;

import java.util.List;

// Inside interface , list all the methods in Implementation
public interface ProductService {

    Product createProduct(Product newProduct);

     List<Product> getAllProducts();


}
