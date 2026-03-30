package com.backend.controller;

import com.backend.dto.ProductDTO;
import com.backend.entity.Product;
import com.backend.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product add(@RequestBody ProductDTO dto) {
        return service.addProduct(dto);
    }

    @GetMapping
    public List<Product> all() {
        return service.getAll();
    }

    @PostMapping("/reduce/{id}/{qty}")
    public String reduce(@PathVariable Long id, @PathVariable int qty) {
        service.reduceStock(id, qty);
        return "Stock updated";
    }
}
