package bg.fmi.course.wdwj.dealership.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealershipDto {
    @NotBlank(message = "Name should not be blank")
    private String name;
}
