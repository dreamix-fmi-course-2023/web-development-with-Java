package com.uni.sofia.dream.car.service;

import com.uni.sofia.dream.car.dto.StockDto;
import com.uni.sofia.dream.car.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StockService {

    private StockRepository stockRepository;

    public List<StockDto> getStock() {
        return stockRepository.getStock();
    }

}
