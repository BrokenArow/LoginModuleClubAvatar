package com.clubavatar.auth.login.service;

import com.clubavatar.auth.login.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final Products products;

    public ProductService(Products products) {
        this.products = products;
    }

    public List<Products> getProducts() {
        return Arrays.asList(
                new Products(1, "Apple iPhone 14", "Newest Apple smartphone with A15 Bionic chip", 999, "Electronics", "Apple"),
                new Products(2, "Samsung Galaxy S23", "Flagship Samsung phone with high-end camera", 850, "Electronics", "Samsung"),
                new Products(3, "Sony WH-1000XM5", "Wireless noise-cancelling over-ear headphones", 349, "Audio", "Sony"),
                new Products(4, "Nike Air Zoom Pegasus 39", "Lightweight running shoes for everyday training", 130, "Footwear", "Nike"),
                new Products(5, "Adidas Ultraboost 22", "High-performance running shoes with responsive cushioning", 180, "Footwear", "Adidas"),
                new Products(6, "Dell XPS 13", "Ultrabook with Intel i7 and 16GB RAM", 1200, "Computers", "Dell"),
                new Products(7, "Bose SoundLink Revolve+", "Portable Bluetooth speaker with 360° sound", 299, "Audio", "Bose"),
                new Products(8, "KitchenAid Stand Mixer", "Versatile stand mixer for baking and cooking", 400, "Appliances", "KitchenAid"),
                new Products(9, "Canon EOS R6", "Full-frame mirrorless camera with 20MP sensor", 2500, "Cameras", "Canon"),
                new Products(10, "Dyson V11 Torque Drive", "Cordless vacuum cleaner with powerful suction", 599, "Home Appliances", "Dyson")
        );
    }

    public Optional<Products> getProductById(int id) {
        List<Products> products = getProducts();
        return products.stream()
                .filter(p -> p.getProductId() == id)
                .findFirst();
    }
}
