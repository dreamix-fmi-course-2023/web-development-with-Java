package com.uni.sofia.dream.car.service;

import com.uni.sofia.dream.car.dto.OrderDto;
import com.uni.sofia.dream.car.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public Long create(OrderDto order) {
        return orderRepository.create(order);
    }
}
