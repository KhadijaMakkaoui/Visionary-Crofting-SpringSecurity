package com.example.demo.rest;

import com.example.demo.service.ProrductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    ProrductService produitService;

    /*public ProduitController(ProduitService produitService) { this.produitService = produitService; }

    @PostMapping("/create")
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.addProduit(produit);
    }

    @PostMapping("/update/{produitId}")
    public Produit updateProduit(@RequestBody Produit produit, @PathVariable Long produitId){
        return produitService.updateProduit(produit, produitId);
    }

    @GetMapping("")
    public List<Produit> getAllProduits(){ return produitService.getAllProduits(); }

    @GetMapping("/produit/{produitId}")
    public Produit getProduitById(@PathVariable Long produitId){ return produitService.getProduitById(produitId); }

    @GetMapping("/{category}")
    public List<Produit> getAllProduitsByCategory(@PathVariable int category){

        return produitService.findProuitsByCategory(category);

    }
*/
}
