package com.uni.sofia.dream.car.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class OrderDto {

    @NotNull(message = "Car can't be null")
    private CarDto car;

    @NotNull(message = "Time of order can't be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime dateTimeOfOrder;

    @NotNull(message = "Dealer name can't be null")
    private String dealerName;
}
