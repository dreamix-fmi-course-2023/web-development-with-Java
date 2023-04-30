package bg.fmi.course.wdwj.dealership.controller;

import bg.fmi.course.wdwj.dealership.dto.DealDto;
import bg.fmi.course.wdwj.dealership.dto.DealershipDto;
import bg.fmi.course.wdwj.dealership.mapper.DealershipMapper;
import bg.fmi.course.wdwj.dealership.model.Car;
import bg.fmi.course.wdwj.dealership.model.Dealership;
import bg.fmi.course.wdwj.dealership.service.DealershipService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("dealerships")
public class DealershipController {
    private DealershipService service;
    private DealershipMapper mapper;

    public DealershipController(final DealershipService service, final DealershipMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public void createDealership(@RequestBody @Valid DealershipDto dealershipDto) {
        service.addDealership(mapper.toEntity(dealershipDto));
    }

    @GetMapping
    public List<DealershipDto> getDealerships() {
        final List<Dealership> dealerships = service.getDealerships();

        return mapper.toDtoCollection(dealerships);
    }

    /**
     * As the name is our current unique identifier, we can retrieve single Dealership by name
     *
     * @param name - by default, the path parameters are unique
     * @return
     */
    @GetMapping("{name}")
    public DealershipDto byName(@PathVariable String name) {
        final Dealership dealershipByName = service.getDealershipByName(name);

        return new DealershipDto(dealershipByName.getName());
    }

//    /**
//     * If thinking about nouns, selling a car can be a Deal resource
//     *
//     * @param deal
//     * @param name - Name is not actually used but is meaningful to make a deal to specific dealership
//     */
//    @PostMapping("{name}/deals")
//    public void sellACar(@PathVariable String name, @RequestBody @Valid DealDto deal) {
//        final Car car = new Car(null, null, 2003, null);
//        service.sellCar(car, deal.customerName);
//    }
//
//    /**
//     * @param name - Dealership name
//     * @param make - Car make. By default request parameters are required
//     * @return Sales as integer. DTO can be additionally created if
//     * we define that our API will always return JSON valid responses
//     */
//    @GetMapping("{name}/sales")
//    public Integer salesByMake(@PathVariable String name, @RequestParam String make) {
//        final Map<String, Integer> salesByMake = service.getSalesByMake();
//
//        return salesByMake.get(make);
//    }
}
