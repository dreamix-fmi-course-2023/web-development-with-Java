package bg.fmi.course.wdwj.dealership.mapper;

import bg.fmi.course.wdwj.dealership.dto.CarDto;
import bg.fmi.course.wdwj.dealership.model.Car;
import bg.fmi.course.wdwj.dealership.model.Dealership;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public CarDto toDto(Car entity) {
        return CarDto.builder()
                .id(entity.getId())
                .dealershipId(entity.getDealership().getId())
                .brand(entity.getBrand())
                .model(entity.getModel())
                .year(entity.getYear())
                .color(entity.getColor())
                .price(entity.getPrice())
                .build();
    }

    public Car toEntity(CarDto dto, Dealership dealership) {
        return Car.builder()
                .id(dto.getId())
                .dealership(dealership)
                .brand(dto.getBrand())
                .model(dto.getModel())
                .year(dto.getYear())
                .color(dto.getColor())
                .price(dto.getPrice())
                .build();
    }
}
