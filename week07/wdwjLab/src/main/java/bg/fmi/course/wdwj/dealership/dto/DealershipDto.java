package bg.fmi.course.wdwj.dealership.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DealershipDto {
    @NotBlank(message = "Name should not be blank")
    private String name;
}
