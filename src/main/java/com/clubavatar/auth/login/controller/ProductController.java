package com.clubavatar.auth.login.controller;

import com.clubavatar.auth.login.model.Products;
import com.clubavatar.auth.login.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Products> returnProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Optional<Products> getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
}
