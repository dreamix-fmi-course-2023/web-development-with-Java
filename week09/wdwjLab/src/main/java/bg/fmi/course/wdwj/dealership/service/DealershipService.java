package bg.fmi.course.wdwj.dealership.service;

import bg.fmi.course.wdwj.dealership.ResourceNotFoundException;
import bg.fmi.course.wdwj.dealership.controller.validation.ApiBadRequest;
import bg.fmi.course.wdwj.dealership.model.Car;
import bg.fmi.course.wdwj.dealership.model.Dealership;
//import bg.fmi.course.wdwj.dealership.model.Invoice;
import bg.fmi.course.wdwj.dealership.repository.DealershipRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Create REST API -> DealershipController that will have all mapped out the public method to API calls
 * Create strategy for error handling (based on specific exception the response to be predefined),
 * example if the inputted data is incorrect throw properly exception
 * and visualise it to the client.
 * (Exception scenario for practise purposes, if there is no dealership, throw 404, if you cannot execute deletion, return proper code)
 */

@Service
public class DealershipService {
    private final CarService carService;
    private final InvoiceService invoiceService;
    private final DealershipRepository dealershipRepository;

    public DealershipService(CarService carService, InvoiceService invoiceService, DealershipRepository dealershipRepository) {
        this.carService = carService;
        this.invoiceService = invoiceService;
        this.dealershipRepository = dealershipRepository;
    }

    public void addDealership(Dealership dealership) {
        if (dealership == null) {
            throw new IllegalArgumentException("Incorrect data");
        }

        final List<Dealership> all = dealershipRepository.getAll();
        for (Dealership dealershipEntity: all) {
            if(dealershipEntity.getName().equals(dealership.getName())) {
                throw new ApiBadRequest("Dealership already exists");
            }
        }
        dealershipRepository.addDealership(dealership);
    }

    public Dealership getDealershipByName(String name) {
        Optional<Dealership> dealership = dealershipRepository.getDealershipByName(name);
        if (dealership.isEmpty()) {
            throw new ResourceNotFoundException("Missing data");
        }

        return dealership.get();
    }

    public List<Dealership> getDealerships() {
        return dealershipRepository.getAll();
    }

//    public void sellCar(Car car, String customerName) {
//        Invoice invoice = new Invoice(customerName, LocalDate.now(), car, car.getPrice(), BigDecimal.valueOf(0.2));
//        invoiceService.addInvoice(invoice);
//        carService.removeCar(car);
//        System.out.println("Car sold to " + customerName + " for " + invoice.getTotalPrice());
//    }

//    public Map<String, Integer> getSalesByMake() {
//        List<Invoice> invoices = invoiceService.getInvoiceHistory();
//        Map<String, Integer> salesByMake = new HashMap<>();
//        for (Invoice invoice : invoices) {
//            String make = invoice.getCar().getMake();
//            salesByMake.put(make, salesByMake.getOrDefault(make, 0) + 1);
//        }
//        return salesByMake;
//    }
}
