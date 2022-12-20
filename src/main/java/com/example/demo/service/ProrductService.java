package com.example.demo.service;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProrductService  {
    ProductRepository productRepository;

    public ProrductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product addProduit(Product produit) { return productRepository.save(produit); }

}
