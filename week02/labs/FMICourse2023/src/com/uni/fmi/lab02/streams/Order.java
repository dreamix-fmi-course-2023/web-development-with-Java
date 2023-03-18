package com.uni.fmi.lab02.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private long id;
    private List<OrderLine> orderLines;
    private LocalDate orderDate;
    private OrderStatus status;
    private PaymentMethod paymentMethod;

    public Order() {
        this.orderLines = new ArrayList<>();
        this.orderDate = LocalDate.now();
        this.status = OrderStatus.ACTIVE;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return orderLines.stream().map(OrderLine::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
