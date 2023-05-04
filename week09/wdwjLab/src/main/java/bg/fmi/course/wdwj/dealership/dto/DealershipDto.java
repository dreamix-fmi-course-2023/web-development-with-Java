package bg.fmi.course.wdwj.dealership.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DealershipDto {
    private Long id;

    @NotBlank(message = "Name should not be blank")
    private String name;

    private String address;

    private String phoneNumber;

    @NotBlank(message = "Name should not be blank")
    private String email;
}

