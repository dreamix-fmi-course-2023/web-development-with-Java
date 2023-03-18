package com.uni.fmi.lab02.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SearchExercise {
    /**
     * extract all active orders
     * @param user
     * @return List<Order>
     */
    public List<Order> getActiveOrders(User user) {
        return user.getOrders().stream()
                .filter(order -> order.getStatus() == OrderStatus.ACTIVE)
                .collect(Collectors.toList());
    }

    public List<Order> getActiveOrdersByIteration(User user) {
        List<Order> activeOrders = user.getOrders();
        for (Order order : activeOrders) {
            if (order.getStatus() != OrderStatus.ACTIVE) {
                activeOrders.remove(order);
            }
        }
        return activeOrders;
    }

    /**
     * Return order by a specific id
     * @param orders
     * @param orderId
     * @return Order
     */
    public Order getOrderById(List<Order> orders, long orderId) {
        return orders.stream()
                .filter(order -> order.getId() == orderId)
                .findFirst()
                .orElse(null);
    }

    public Order getOrderByIdIteration(List<Order> orders, long orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                return order;
            }
        }
        return null;
    }

    /**
     * Return orders that have specific description for item
     * @param user
     * @param description
     * @return List<Order>
     */
    public List<Order> getOrdersThatHaveItemDescription(User user, String description) {
        return user.getOrders().stream()
                .filter(order -> order.getOrderLines().stream()
                        .anyMatch(orderLine -> orderLine.getItem().getDescription().equals(description)))
                .collect(Collectors.toList());
    }

    /**
     * @return true if customer has at least one order with status ACTIVE
     */
    public boolean hasActiveOrders(User user) {
        return user.getOrders().stream()
                .anyMatch(order -> order.getStatus() == OrderStatus.ACTIVE);
    }

    /**
     * Return true if inside the Order we don't have OrderLine with special offer
     */
    public boolean canBeReturned(Order order) {
        return order.getOrderLines().stream()
                .noneMatch(OrderLine::isSpecialOffer);
    }

    /**
     * Return the order with maximum total price
     * @param user
     * @return
     */
    public Optional<Order> getMaxPriceOrder(User user) {
        return user.getOrders().stream()
                .max(Comparator.comparing(Order::getPrice));
    }
}
