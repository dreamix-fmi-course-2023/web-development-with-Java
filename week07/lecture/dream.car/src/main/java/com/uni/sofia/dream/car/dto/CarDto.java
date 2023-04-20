package com.uni.sofia.dream.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private String color;
    @NotNull
    private String code;
    private String description;
}
