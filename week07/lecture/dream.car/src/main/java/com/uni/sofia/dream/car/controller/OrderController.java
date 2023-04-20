package com.uni.sofia.dream.car.controller;

import com.uni.sofia.dream.car.dto.OrderDto;
import com.uni.sofia.dream.car.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    @PostMapping
    public Long create(@Validated @RequestBody OrderDto order) {
        return orderService.create(order);
    }
}
