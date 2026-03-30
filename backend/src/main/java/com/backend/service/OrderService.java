package com.backend.service;
import com.backend.dto.OrderDTO;
import com.backend.entity.Orders;
import com.backend.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    private final OrderRepository repo;
    private final RestTemplate restTemplate;

    public OrderService(OrderRepository repo, RestTemplate restTemplate) {
        this.repo = repo;
        this.restTemplate = restTemplate;
    }

    public Orders placeOrder(OrderDTO dto) {

        // 🔁 Inventory Sync
        restTemplate.postForObject(
                "http://localhost:8081/products/reduce/" + dto.productId + "/" + dto.quantity,
                null,
                String.class
        );

        Orders order = new Orders();
        order.setProductId(dto.productId);
        order.setQuantity(dto.quantity);
        order.setTotalPrice((double) (dto.quantity * 100));

        return repo.save(order);
    }
}