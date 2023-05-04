package bg.fmi.course.wdwj.dealership.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private Long id;
    private Long dealershipId;
    private String brand;
    private String model;
    private int year;
    private String color;
    private BigDecimal price;
}
