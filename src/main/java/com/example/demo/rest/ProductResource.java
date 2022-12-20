package com.example.demo.rest;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    ProductService produitService;

    public ProductResource(ProductService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public List<Product> getAllProduits(){ return produitService.getAllProduits(); }

    @PostMapping
    public Product addProduit(@RequestBody Product product){
        return produitService.addProduit(product);
    }
/*
    @PostMapping("/update/{produitId}")
    public Produit updateProduit(@RequestBody Produit produit, @PathVariable Long produitId){
        return produitService.updateProduit(produit, produitId);
    }


    @GetMapping("/produit/{produitId}")
    public Produit getProduitById(@PathVariable Long produitId){ return produitService.getProduitById(produitId); }

    @GetMapping("/{category}")
    public List<Produit> getAllProduitsByCategory(@PathVariable int category){

        return produitService.findProuitsByCategory(category);

    }
*/
}
