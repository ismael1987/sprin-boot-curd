package com.ismael.curd.repository;

import com.ismael.curd.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
