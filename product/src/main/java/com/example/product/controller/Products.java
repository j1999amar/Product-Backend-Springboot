package com.example.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Products {
    @PostMapping("/productsAdd")
    public String ProductAdd(){
        return "Product Add Page";
    }
    @PostMapping("/productsSearch")
    public String ProductSearch(){
        return "Product Search Page";
    }
    @GetMapping("/productsViewAll")
    public String ProductViewAll(){
        return "Product ViewAll Page";
    }

}
