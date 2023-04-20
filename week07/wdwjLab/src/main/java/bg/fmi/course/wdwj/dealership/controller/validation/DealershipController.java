package bg.fmi.course.wdwj.dealership.controller.validation;

import bg.fmi.course.wdwj.dealership.dto.DealershipDto;
import bg.fmi.course.wdwj.dealership.model.Dealership;
import bg.fmi.course.wdwj.dealership.service.DealershipService;
import bg.fmi.course.wdwj.logger.Logger;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("dealerships")
public class DealershipController {
    private DealershipService service;
    private Logger logger;

    public DealershipController(final DealershipService service, final Logger logger) {this.service = service;
        this.logger = logger;
    }

    @PostMapping
    public void createDealership(@RequestBody @Valid DealershipDto dealershipDto) {

        final Dealership dealershipToCreate = new Dealership(dealershipDto.getName());
        service.addDealership(dealershipToCreate);
    }
}
