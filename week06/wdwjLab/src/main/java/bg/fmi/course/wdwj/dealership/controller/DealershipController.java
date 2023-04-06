package bg.fmi.course.wdwj.dealership.controller;

import bg.fmi.course.wdwj.dealership.model.Dealership;
import bg.fmi.course.wdwj.dealership.service.DealershipService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dealerships")
public class DealershipController {

    private final DealershipService dealershipService;

    public DealershipController(DealershipService dealershipService) {
        this.dealershipService = dealershipService;
    }

    //http://localhost:8080/dealerships/asd
    @GetMapping("/{name}")
    public Dealership getAllDealershipByName(@PathParam("name") String name) {
        System.out.println(name);
        return dealershipService.getDealershipByName(name);
    }

    //http://localhost:8080/dealerships/RequestParam?name=asd
    //http://localhost:8080/dealerships/RequestParam?name=asd%20qwe
    @GetMapping("/RequestParam")
    public Dealership getAllDealershipByNameRequestParam(@RequestParam("name") String name) {
        System.out.println(name);
        return dealershipService.getDealershipByName(name);
    }

    @GetMapping("")
    public List<Dealership> getAllDealership() {
        return dealershipService.getDealerships();
    }
}
