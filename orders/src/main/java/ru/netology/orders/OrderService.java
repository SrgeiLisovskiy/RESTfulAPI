package ru.netology.orders;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    Optional<Order> getOrderById(int userId) {
        return repository.getOrderById(userId);
    }
}
