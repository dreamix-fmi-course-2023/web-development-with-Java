package com.fmi.week03;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DealershipService {
    private CarService carService;
    private InvoiceService invoiceService;
    private DealershipRepository dealershipRepository;

    public DealershipService(CarService carService, InvoiceService invoiceService) {
        this.carService = carService;
        this.invoiceService = invoiceService;
    }

    public void addDealership(Dealership dealership) {
        if (dealership == null) {
            throw new IllegalArgumentException("Missing data");
        }
        dealershipRepository.addDealership(dealership);
    }

    public void addCar(Car car) {
        carService.addCar(car);
    }

    public void removeCar(Car car) {
        carService.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, int year, double price) {
        return carService.searchCars(make, model, year, price);
    }

    public void sellCar(Car car, String customerName) {
        Invoice invoice = new Invoice(customerName, LocalDate.now(), car, car.getPrice(), BigDecimal.valueOf(0.2));
        invoiceService.addInvoice(invoice);
        carService.removeCar(car);
        System.out.println("Car sold to " + customerName + " for " + invoice.getTotalPrice());
    }

    public void printInvoice(Invoice invoice) {
        System.out.println(invoice.toString());
    }

    public Map<String, Integer> getSalesByMake() {
        List<Invoice> invoices = invoiceService.getInvoiceHistory();
        Map<String, Integer> salesByMake = new HashMap<>();
        for (Invoice invoice : invoices) {
            String make = invoice.getCar().getMake();
            salesByMake.put(make, salesByMake.getOrDefault(make, 0) + 1);
        }
        return salesByMake;
    }

    public double getTotalRevenue() {
        List<Invoice> invoices = invoiceService.getInvoiceHistory();
        double totalRevenue = 0;
        for (Invoice invoice : invoices) {
            totalRevenue += invoice.getTotalPrice().doubleValue();
        }
        return totalRevenue;
    }
}
