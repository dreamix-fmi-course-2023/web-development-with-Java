package bg.fmi.course.wdwj.dealership.service;

import bg.fmi.course.wdwj.dealership.model.Car;
import bg.fmi.course.wdwj.dealership.model.Invoice;
import bg.fmi.course.wdwj.dealership.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public void removeCar(Car car) {
        carRepository.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, int year, double price) {
        return carRepository.searchCars(make, model, year, price);
    }

    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    public Invoice sellCar(Car car, String customerName) {
        Invoice invoice = new Invoice(customerName,LocalDate.now(), car, car.getPrice(), BigDecimal.valueOf(0.2));
        carRepository.removeCar(car);

        return invoice;
    }
}
