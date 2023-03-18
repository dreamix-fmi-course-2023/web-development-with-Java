package com.fmi.week03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<>();
    }
    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> searchCars(String make, String model, int year, double price) {
        return this.cars.stream()
                .filter(car ->
                                car.getMake().equals(make) &&
                                car.getModel().equals(model) &&
                                car.getYear() == year &&
                                car.getPrice() == price
                ).collect(Collectors.toList());

    }

    public List<Car> getAllCars() {
        return this.cars;
    }
}
