package com.uni.sofia.dream.car.repository;

import com.uni.sofia.dream.car.dto.CarDto;
import com.uni.sofia.dream.car.dto.StockDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class StockRepository {

    public static Map<String, StockDto> stock;

    static {
        stock = new HashMap<>();

        stock.put("BMW_X3", new StockDto(new CarDto("black", "BMW_X3", "X3"), 3));
        stock.put("BMW_X5", new StockDto(new CarDto("white", "BMW_X5", "X5"), 2));
        stock.put("Mercedes_GCL", new StockDto(new CarDto("blue", "Mercedes_GCL", "GLC"), 6));
    }

    public List<StockDto> getStock() {
        return stock.values().stream().collect(Collectors.toList());
    }
}
