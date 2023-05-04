package bg.fmi.course.wdwj.dealership.service;

import bg.fmi.course.wdwj.dealership.dto.CarDto;
import bg.fmi.course.wdwj.dealership.mapper.CarMapper;
import bg.fmi.course.wdwj.dealership.model.Car;
//import bg.fmi.course.wdwj.dealership.model.Invoice;
import bg.fmi.course.wdwj.dealership.model.Dealership;
import bg.fmi.course.wdwj.dealership.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Autowired
    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public Long addCar(Car car) {
        // TODO: Check if car already exists for make/model/year
//        carRepository.addCar(car);
        return carRepository.save(car).getId();
    }

    public void removeCar(Car car) {
//        carRepository.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, int year, double price) {
        return null;//carRepository.searchCars(make, model, year, price);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car constructCarEntityBy(CarDto car, Dealership dealership) {
        return carMapper.toEntity(car, dealership);
    }

//    public Invoice sellCar(Car car, String customerName) {
//        Invoice invoice = new Invoice(customerName,LocalDate.now(), car, car.getPrice(), BigDecimal.valueOf(0.2));
//        carRepository.removeCar(car);
//
//        return invoice;
//    }
}
