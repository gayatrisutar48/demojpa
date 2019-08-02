package com.fourthjpa.demojpa.repository;

import com.fourthjpa.demojpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Product,Integer> {



}
