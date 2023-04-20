package com.uni.sofia.dream.car.repository;

import com.uni.sofia.dream.car.dto.OrderDto;
import com.uni.sofia.dream.car.dto.StockDto;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    private static Long orderSequence = 0L;

    public Long create(OrderDto order) {
        String carCode = order.getCar().getCode();
        StockDto stock = StockRepository.stock.get(carCode);

        if (stock != null) {
            stock.setAvailableCars(stock.getAvailableCars() - 1);
            StockRepository.stock.put(carCode, stock);
        }

        return ++orderSequence;
    }
}
