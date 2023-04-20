package com.uni.sofia.dream.car.controller;

import com.uni.sofia.dream.car.dto.StockDto;
import com.uni.sofia.dream.car.service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/stock")
public class StockController {

    private StockService stockService;

    @GetMapping
    public List<StockDto> getStock() {
        return stockService.getStock();
    }
}
