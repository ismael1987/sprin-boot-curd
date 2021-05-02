package com.ismael.curd.service;


import com.ismael.curd.entity.Product;
import com.ismael.curd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){

        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){

        return repository.saveAll(products);
    }

    public List<Product> getProducts(){

        return repository.findAll();
    }

    public Product getOneProducts(int id){

        return repository.findById(id).orElse(null);
    }

    public Product getProductsByName(String name){

        return repository.findByName(name);
    }

    public String deleteProductsById(int id){

        repository.deleteById(id);
        return "product removed"+ id;
    }

    public Product updateProduct(Product product){

        Product exisitingProduct = repository.findById(product.getId()).orElse(null);
        exisitingProduct.setName(product.getName());
        exisitingProduct.setPrice(product.getPrice());
        exisitingProduct.setQuantit(product.getQuantit());
        return  repository.save(exisitingProduct);
    }
}
