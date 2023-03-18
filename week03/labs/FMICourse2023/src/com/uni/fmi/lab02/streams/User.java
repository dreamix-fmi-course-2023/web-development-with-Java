package com.uni.fmi.lab02.streams;

import java.util.ArrayList;
import java.util.List;

import com.uni.fmi.lab02.streams.Order;

public class User {
    private List<Order> orders;

    public User() {
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}



