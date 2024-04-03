package org.activite2.activite2.web;


import org.activite2.activite2.entities.Product;
import org.activite2.activite2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> products(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product products(@PathVariable Long id){
        return productRepository.findById(id).get();
    }
}
