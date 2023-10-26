package com.example.hellospring.services;

import com.example.hellospring.models.Product;
import com.example.hellospring.repository.ProductRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Declare dia sebagai service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

     final ProductRepository productRepository;

    // Create

    // Next class we will use DTO instead of Product
    public Product createProduct(Product newProduct){
        return productRepository.save(newProduct);
    }

    // Read All

    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }


    // Read By Id


    // Update


    // Delete
}
