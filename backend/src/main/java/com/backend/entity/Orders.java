package com.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private Integer quantity;
    private Double totalPrice;

    // ✅ Getter for ID
    public Long getId() {
        return id;
    }

    // ✅ Setter for ID
    public void setId(Long id) {
        this.id = id;
    }

    // ✅ Getter & Setter for Product ID
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    // ✅ Getter & Setter for Quantity
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // ✅ Getter & Setter for Total Price
    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}