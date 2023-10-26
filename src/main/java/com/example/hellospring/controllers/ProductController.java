package com.example.hellospring.controllers;

import com.example.hellospring.models.Product;
import com.example.hellospring.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Ini adalah API!!!
@RequestMapping("/api/products") // Ini adalah URL dia!!
@RequiredArgsConstructor   // Ini automatically create constructor for me
public class ProductController {

    final ProductService productService;

    @PostMapping    // Panggil method POST
    public Product createProduct(@RequestBody Product product){ // @RequestBody -> Data yang dihantar dari body HARUS IKUT FORMAT Java
        return productService.createProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

}
