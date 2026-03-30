package com.backend.controller;

import com.backend.dto.OrderDTO;
import com.backend.entity.Orders;
import com.backend.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Orders place(@RequestBody OrderDTO dto) {
        return service.placeOrder(dto);
    }
}