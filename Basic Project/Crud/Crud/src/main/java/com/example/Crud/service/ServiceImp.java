package com.example.Crud.service;


import com.example.Crud.Entity.Product;
import com.example.Crud.dao.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    public List<Product> showAllProduct(){
       return repository.findAll();
    }

    public Product findById(int id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Id not found");
    }

    public void addProduct(Product product){
        repository.save(product);
    }


}
