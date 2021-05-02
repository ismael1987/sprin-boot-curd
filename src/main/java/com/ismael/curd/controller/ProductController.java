package com.ismael.curd.controller;

import com.ismael.curd.entity.Product;
import com.ismael.curd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){

        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){

        return productService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProduct(){
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findOneProduct(@PathVariable int id){
        return productService.getOneProducts(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return productService.getProductsByName(name);
    }

    @PutMapping("/update")
    public Product updateOneProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProductsById(id);
    }
}
