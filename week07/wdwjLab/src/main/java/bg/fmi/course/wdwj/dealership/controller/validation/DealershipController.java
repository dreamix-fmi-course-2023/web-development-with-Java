package bg.fmi.course.wdwj.dealership.controller.validation;

import bg.fmi.course.wdwj.dealership.dto.DealershipDto;
import bg.fmi.course.wdwj.dealership.mapper.DealershipMapper;
import bg.fmi.course.wdwj.dealership.model.Dealership;
import bg.fmi.course.wdwj.dealership.service.DealershipService;
import bg.fmi.course.wdwj.logger.Logger;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("dealerships")
public class DealershipController {
    private DealershipService service;
    private Logger logger;
    private DealershipMapper mapper;

    public DealershipController(final DealershipService service, final Logger logger) {
        this.service = service;
        this.logger = logger;
        this.mapper = mapper;
    }

    @PostMapping
    public void createDealership(@RequestBody @Valid DealershipDto dealershipDto) {

        final Dealership dealershipToCreate = new Dealership(dealershipDto.getName());
        service.addDealership(dealershipToCreate);
    }

    @GetMapping
    public List<DealershipDto> getDealerships() {
        final List<Dealership> dealerships = service.getDealerships();

        return dealerships.stream()
                          .map(dealership -> new DealershipDto(dealership.getName()))
                          .collect(Collectors.toList());
    }

    @ExceptionHandler({ ApiBadRequest.class }) //400 // 404
    public ResponseEntity<?> handleBadRequest(ApiBadRequest exception) {
        // ApiErrorDto -> message, code
        return ResponseEntity.badRequest().body(exception.getMessage() + " from advice");
    }
}
