package com.fourthjpa.demojpa.controller;

import com.fourthjpa.demojpa.model.Product;
import com.fourthjpa.demojpa.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @PostMapping(value = "/saveproduct")
    public String saveProduct(@RequestBody Product product) {
        productRepo.save(product);
        return "product saved";
    }


    @GetMapping(value="/getproduct/{id}")
    public Optional<Product> getProduct(@PathVariable Integer id){
        Optional<Product> p=productRepo.findById(id);
        return p;
    }

    @GetMapping(value="/getallproducts")
    public List<Product> getAllProducts(){
        List<Product> p=productRepo.findAll();
        return p;
    }
}