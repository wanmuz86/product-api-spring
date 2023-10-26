package com.example.hellospring.models;

import jakarta.persistence.*;
import lombok.Data;

// @Entity -> This is our model create it in database
@Entity
@Table(name = "products") // I want to override the table name to products
@Data // Generate getter and setter for me   // .poster, .name , .year <- Getter (Mendapatkan value dari property) / Setter -> Menetapkan value
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Manage the ID for me (Auto-generated)
    private Long id;

    private String name;

    private String description;

    private Double price;

    private String imageUrl;
}
