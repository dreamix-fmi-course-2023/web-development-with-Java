package bg.fmi.course.wdwj.dealership.mapper;

import bg.fmi.course.wdwj.dealership.dto.DealershipDto;
import bg.fmi.course.wdwj.dealership.model.Dealership;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DealershipMapper {

    DealershipDto toDto(Dealership model);

    List<DealershipDto> toList(List<Dealership> entities);
}
