package com.quickcart.ecommerce.controller;

import com.quickcart.ecommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping({"/", "/products"})
    public String getProducts(Model productModel) {
        // Create a list to hold our products
        List<Product> products = new ArrayList<>();

        // Create sample product objects
        Product laptop = new Product(1, "Laptop", "A high-performance laptop for work and play", 899.99);
        Product smartphone = new Product(2, "Smartphone", "Latest smartphone with advanced features", 599.99);
        Product headphones = new Product(3, "Headphones", "Noise-cancelling headphones for immersive audio", 149.99);

        // Add products to the list
        products.add(laptop);
        products.add(smartphone);
        products.add(headphones);

        // Add the list to the model with the key "products"
        productModel.addAttribute("products", products);

        // Return the view name
        return "products";
    }
}