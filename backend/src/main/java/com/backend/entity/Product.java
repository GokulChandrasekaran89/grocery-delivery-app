package com.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private Integer stock;

    // ✅ Getter for ID
    public Long getId() {
        return id;
    }

    // ✅ Setter for ID
    public void setId(Long id) {
        this.id = id;
    }

    // ✅ Getter & Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ✅ Getter & Setter for Price
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // ✅ Getter & Setter for Stock
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}