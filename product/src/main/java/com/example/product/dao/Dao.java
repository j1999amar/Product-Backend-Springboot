package com.example.product.dao;

import com.example.product.model.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface Dao extends CrudRepository<ProductModel,Integer>{
}
