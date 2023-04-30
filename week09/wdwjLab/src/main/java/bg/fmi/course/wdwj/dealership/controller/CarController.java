package bg.fmi.course.wdwj.dealership.controller;

import bg.fmi.course.wdwj.dealership.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cars")
@AllArgsConstructor
public class CarController {

    private final CarService carService;
}
