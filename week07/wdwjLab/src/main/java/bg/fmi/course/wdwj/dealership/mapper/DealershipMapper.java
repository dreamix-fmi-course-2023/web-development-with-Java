package bg.fmi.course.wdwj.dealership.mapper;

import bg.fmi.course.wdwj.dealership.dto.DealershipDto;
import bg.fmi.course.wdwj.dealership.model.Dealership;
import java.util.Collections;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TODO: If mapping methods becomes too complex, change to Mapstruct
 */
@Component
public class DealershipMapper {

    public DealershipDto toDto(Dealership entity) {
        return new DealershipDto(entity.getName());
    }

    public List<DealershipDto> toDtoCollection(List<Dealership> entities) {
        if(entities == null) {
            return Collections.emptyList();
        }

        return entities.stream()
                       .map(this::toDto)
                       .toList();
    }

    public Dealership toEntity(DealershipDto dealershipDto) {
        return new Dealership(dealershipDto.getName());
    }
}
