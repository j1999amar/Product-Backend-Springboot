package com.example.product.controller;

import com.example.product.dao.Dao;
import com.example.product.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Products {
    @Autowired
    private Dao dao;
    @PostMapping(path = "/productsAdd",consumes = "application/json",produces = "application/json")
    public String ProductAdd(@RequestBody ProductModel productModel ){
        dao.save(productModel);
        return "Product Add Page";
    }
    @PostMapping("/productsSearch")
    public String ProductSearch(){
        return "Product Search Page";
    }
    @GetMapping("/productsViewAll")
    public List<ProductModel> ProductViewAll(){

        return (List<ProductModel>) dao.findAll();
    }
    @PostMapping("/productsDelete")
    public String ProductDelete(){
        return "Product Delete Page";
    }

}
