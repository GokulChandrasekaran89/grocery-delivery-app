package com.backend.service;
import com.backend.dto.ProductDTO;
import com.backend.entity.Product;
import com.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product addProduct(ProductDTO dto) {
        Product p = new Product();
        p.setName(dto.name);
        p.setPrice(dto.price);
        p.setStock(dto.stock);
        return repo.save(p);
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public void reduceStock(Long id, int qty) {
        Product p = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (p.getStock() < qty) {
            throw new RuntimeException("Insufficient stock");
        }

        p.setStock(p.getStock() - qty);
        repo.save(p);
    }
}